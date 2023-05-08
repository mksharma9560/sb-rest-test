pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
                //bat "rmdir  /s /q sbDemoRemote"
                bat "git clone https://github.com/mksharma9560/sbDemoRemote.git"
                bat "mvn clean -f sbDemoRemote"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f sbDemoRemote"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f sbDemoRemote"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f sbDemoRemote"
            }
        }
    }
}
