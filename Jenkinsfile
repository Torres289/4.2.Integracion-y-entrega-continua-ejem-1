pipeline {
    agent any

    tools {
        maven 'MAVEN3'
    }
    stages {
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
    }
}