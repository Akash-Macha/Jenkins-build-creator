

pipeline {
    agent any
    // environment {
        // - can define variables here
        // NEW_VERSION = '1.3.0'
        
        // - Install: Credentials Binding Plugin
        // USER_CREDENTIALS = credentials('Id-Reference')
    // }
    parameters {
        string(name: "RELEASE_VERSION", defaultValue: '3.2.0-M01', description: 'Release version for the build.')
        string(name: "SNAPSHOT_VERSION", defaultValue: '3.2.0-M02-SNAPSHOT', description: 'Snapshot version for the build.')
        choice(name: 'START_THE_BUILD_FROM', choices: ['nxBase', 'nxWidgets', 'nxNjsa'], description: 'Use this feature to start the build from certain project. Usually used when build fails in between.')
        // Can use to skip a few steps in the build! - booean
        // booleanParam(name: 'executeTests', defaultValue: false, description: '')
    }

    stages {
        stage('Clone nxBase') {
            steps {
                echo 'Clone nxBase repository'
                git branch: 'main', poll: false, url: 'https://github.com/Akash-Macha/base-jenkins-project.git'
            }
        }
        stage('Build nxBase') {
            steps {
                echo 'In Build nxBase Step'

                pwd()
                echo "Building version ${params.RELEASE_VERSION}"
                
                echo 'Run grunt command'
                
                echo 'Push commits to git repo'
                
                echo 'Wait for the nxBase build to get succeed'

            }
        }
        stage('Load external groovy script') {
            steps {
                echo "Loading external groovy script"
                script {
                    // we can now use the functionality using gv variable
                    gv = load "script.groovy"

                    gv.buildApp()
                    gv.testApp()
                    gv.deployApp()
                }
            }
        }
    }
}
