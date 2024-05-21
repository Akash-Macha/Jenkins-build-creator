
pipeline {
    agent any
    parameters {
        string(name: 'RELEASE_VERSION', defaultValue: '3.2.0-M01', description: 'Release version for the build.')
        string(name: 'SNAPSHOT_VERSION', defaultValue: '3.2.0-M02-SNAPSHOT', description: 'Snapshot version for the build.')
        choice(name: 'START_THE_BUILD_FROM',
                choices: ['nxBase', 'nxWidgets', 'nxNjsa'],
                description: 'Use this feature to start the build from certain project. Usually used when build fails in between.')
    }

    stages {
        stage('Clean Workspace') {
            step {
                echo 'Clean Workspace'
                cleanWs()
            }
        }
        stage('Clone nxBase') {
            steps {
                script {
                    sh 'mkdir -p BaseJenkinsProject'
                    sh 'cd BaseJenkinsProject'
                    
                    // The below will clone your repo and will be checked out to master branch by default.
                    git branch: 'main', url: 'https://github.com/Akash-Macha/base-jenkins-project.git'
                    // Do a ls -lart to view all the files are cloned. It will be clonned. This is just for you to be sure about it.
                    sh 'ls -lart ./*'
                    // List all branches in your repo.
                    sh 'git branch -a'
                }
            }
        }
    }
}
