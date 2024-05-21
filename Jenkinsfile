
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
            steps {
                echo 'Clean Workspace'
                cleanWs()
            }
        }
        stage("Clone Git Repository") {
            steps {
                dir("BaseJenkinsProject") {
                    git(
                        url: "https://github.com/Akash-Macha/base-jenkins-project.git",
                        branch: "main"
                    )
                }
            }
        }
        stage('Run Grunt command') {
            steps {
                bat 'cd BaseJenkinsProject && npm i'
                bat 'cd BaseJenkinsProject && grunt nx-process --set-version=1.1.0'
            }
        }
    }
}
