pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven'
    }

    stages {

        stage('Build and Test') {
            steps {
                bat 'mvn clean test package'
            }
        }

    }
}