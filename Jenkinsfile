pipeline {
    agent any

    tools {
        maven 'Maven'
    }
    stages {
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
    }
}