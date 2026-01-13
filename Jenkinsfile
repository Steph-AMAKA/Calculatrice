pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compilation du projet Calculatrice'
                sh 'apt-get update && apt-get install -y maven openjdk-17-jdk && mvn clean compile'
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
