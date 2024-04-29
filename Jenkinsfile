pipeline {
  agent any
  stages {
    stage('Clone Repo') {
      steps {
        git(url: 'https://github.com/Akash-Macha/base-jenkins-project', branch: 'main')
      }
    }

    stage('Update build version') {
      steps {
        bat(script: 'npm.cmd version $ReleaseVersion', returnStatus: true)
      }
    }

  }
}