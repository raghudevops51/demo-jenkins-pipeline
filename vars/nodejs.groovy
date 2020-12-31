

def call(String app_name) {
  pipeline {
    agent any

    tools {
      nodejs 'node15'
    }
    stages {
      stage('Install Node Dependencies') {
        steps {
          sh 'npm install'
        }
      }

      stage('Build Docker Image') {
        agent {
          node {
            label 'DOCKER'
          }
        }
        steps {
          sh "docker build -t rkalluru/d51-rs-${app_name}:latest ."
        }
      }

    }

  }
}