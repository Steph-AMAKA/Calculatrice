pipeline {
    agent any

    tools {
        maven 'Maven-3'
        jdk 'JDK-17'
    }

    stages {

        stage('Build') {
            steps {
                echo 'Compilation du projet Calculatrice'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Exécution des tests unitaires'
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Déploiement (simulation)'
                sh 'mkdir -p deploy && echo "Calculatrice déployée" > deploy/status.txt'
            }
        }
    }

    post {
        success {
            echo 'Pipeline CI/CD exécutée avec succès ✅'
        }
        failure {
            echo 'Échec de la pipeline ❌'
        }
    }
}
