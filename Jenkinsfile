pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                echo 'Welcome to my first pipeline' 
            }
        }
        stage('Stage 2') {
            steps {
                echo 'lets compile' 
                sh 'javac MyTest.java'
            }
        }
    }
}
