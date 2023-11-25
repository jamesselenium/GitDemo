pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                sh '''
          robot outputPath: '.', logFileName: 'log.html', outputFileName: 'output.xml', reportFileName: 'report.hml', passThreshold: 100, unstableThreshold: 75.0
            '''
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
