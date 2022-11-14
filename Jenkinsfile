pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                echo 'Hey Michy'
            }
        }
        stage('Build') {
            steps {
                echo 'Building Nodejs app'
            }
        }
        stage('Deploy') {
            steps {
               build job: 'node_project2'
            }
        }
    }
}