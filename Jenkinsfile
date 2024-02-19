#!groovy

// Отключаем параллельные сборки для этой задачи
properties([disableConcurrentBuilds()])

pipeline {
    agent any // Запускаем задачу на любом доступном узле

    stages {
        stage('Check Jenkinsfile') {
            steps {
                // Выводим текущий рабочий каталог
                sh 'pwd'

                // Проверяем наличие файла Jenkinsfile в рабочем каталоге
                sh 'ls -l Jenkinsfile || echo "Jenkinsfile not found"'
            }
        }
    }
}
