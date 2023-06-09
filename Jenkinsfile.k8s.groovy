podTemplate(containers: [
  containerTemplate(name: 'maven', image: 'maven:3.9.2-eclipse-temurin-17', command: 'sleep', args: '99d')
  ]) {

  node(POD_LABEL) {
    stage('Test') {
      container('maven') {
        sh 'mvn test'
      }
    }
  }
}