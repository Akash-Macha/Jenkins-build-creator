/*
All the environment variables in Jenkinsfile are available in the groovy script
*/

def buildApp() {
  echo "Building App from script.groovy file"
}

def testApp() {
  echo "Testing App from script.groovy file"
}

def deplyApp() {
  echo "Deploying App from script.groovy file"
}

return this
