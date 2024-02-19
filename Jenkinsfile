pipeline {
    agent any // Используйте любой доступный агент для выполнения задачи

    stages {
        stage('Checkout') {
            steps {
                // Получаем код из репозитория
                git 'https://github.com/your-username/your-repo.git'
            }
        }

        stage('Build') {
            steps {
                // Запускаем Maven сборку
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Запускаем тесты с помощью Maven
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // Завершаем работу агента после выполнения всех этапов
            cleanWs()
        }
    }
}
