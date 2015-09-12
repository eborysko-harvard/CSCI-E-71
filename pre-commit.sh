#!/bin/bash
 
# save the file as <git_directory>/.git/hooks/pre-commit.d/mvn_test and chmod +x
LOG_FILE="./pre-commit.log"

exec 3>&1 1>>${LOG_FILE} 2>&1
 
echo "Running mvn clean test for errors"

# retrieving current working directory
CWD=`pwd`

echo "Source ${BASH_SOURCE[0]}" | tee -a /dev/fd/3

MAIN_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
# go to main project dir
cd $MAIN_DIR/../../csci.e-71.eborysko.hw1/
NEWCWD=`pwd`
echo "Working in ${NEWCWD}" | tee -a /dev/fd/3
echo "Running mvn clean test"
# running maven clean test
MVN_RESULT=$( /usr/local/bin/mvn clean test 2>&1)
if [ $? -ne 0 ]; then
  echo
  #echo "${MVN_RESULT}" | ((tee /dev/fd/5 | grep -A 10 -B 2 "Reactor Summary:" >/dev/fd/4) 5>&1 | sed -n -e '/^Failed tests:/,/Tests run:.*$/ p' ) 4>&1
  echo "${MVN_RESULT}"
  echo
  echo "Error while testing the code"
  # go back to current working dir
  cd $CWD
  exit 1
fi

echo "mvn results..."
echo "$MVN_RESULT"
echo "Successfully completed mvn clean test"

# go back to current working dir
cd $CWD
exit 0
