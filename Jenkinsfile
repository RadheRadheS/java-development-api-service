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

        stage('Deploy to Tomcat') {
            steps {
                bat '''
                    copy /Y "target\\employee-management.war" "C:\\Users\\SiriGoud\\Downloads\\apache-tomcat-10.1.59-windows-x64\\apache-tomcat-10.1.59\\webapps\\employee-management.war"
                '''
            }
        }

    }
}
