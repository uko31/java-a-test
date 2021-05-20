pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                echo 'Welcome to my first pipeline' 
            }
        }
        stage('Stage 2: Compilation') {
            steps {
                echo 'lets compile' 
                sh 'javac MyTest.java'
            }
        }
        stage('Stage 3: Test') {
            steps {
                echo 'lets test' 
                sh 'java MyTest "this is an argument" and another one'
            }
        }
    }
}
