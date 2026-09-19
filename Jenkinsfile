pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven'
    }

    stages {

        stage('Verify Tools') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test package'
            }
        }

    }
}
