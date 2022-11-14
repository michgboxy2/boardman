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
               timeout(time:5, unit:'DAYS'){
                   input message: 'Approve PRODUCTION DEPLOYMENT?'
               }

               build job: 'node_project2'
            }
            post {
                success {
                    echo "Deployment completed"
                }
            }

        }
    }
}