

def call(String app_name) {
  pipeline {
    agent any
    stages {

      stage('First') {
        steps {
          sh 'echo Hello World'
          sh "echo APP_NAME = ${app_name}"
        }
      }

    }
  }
}