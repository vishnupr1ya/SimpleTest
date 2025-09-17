pipeline{
    agent any
    tools{
        maven 'Maven3'
    }
    stages{
        stage("Checkout"){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vishnupr1ya/SimpleTest.git']])
            }
            
        }
        stage("Build"){
            steps{
                bat 'mvn clean install'
            }
            
        }
        stage("Test"){
            steps{
                bat 'mvn test'
            }
            
            
        }
        stage("Package"){
            steps{
                bat 'mvn package'
            }
            
        }
        
    }
}
