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
            # Print Chrome version
            # google-chrome --version
            # Launch Robot Tests with Chrome
            robot --pythonpath libraries --variablefile configurations/remote_kazan_chrome.py --variable ENV:${ENV} -d results/chrome --log log_chrome.html --output output_chrome.xml --report report_chrome.html cases/JTI/Socle_Examples
            #robot --pythonpath libraries -t "Simulate UIDs generation For Manual Test" --variablefile configurations/remote_kazan_chrome.py --variable ENV:${ENV} -d results/chrome --log log_chrome.html --output output_chrome.xml --report report_chrome.html cases/JTI/Socle_Examples
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
