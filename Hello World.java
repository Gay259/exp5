pipeline {
  agent any

    stage{
    stage('complie'){
      steps{
        steps{
        sh'javac Addition.java'
          }
    }
    stage('Run'){
      steps{
        sh'java Addition'
        }
  }
  }
  }
