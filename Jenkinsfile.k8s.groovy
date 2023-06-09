podTemplate(containers: [
  containerTemplate(name: 'maven', image: 'maven:3.9.2-eclipse-temurin-17', command: 'sleep', args: '99d')
  ]) {

  node(POD_LABEL) {
    stage('Test') {
      git 'https://github.com/gortazar/4.2.Integracion-y-entrega-continua-ejem-1.git'
      container('maven') {
        sh 'mvn test'
      }
    }
  }
}