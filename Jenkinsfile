podTemplate(containers: [
    containerTemplate(name: 'maven', image: 'maven:3.6.1-jdk-8-alpine', ttyEnabled: true, command: 'cat')
  ]) {

    node(POD_LABEL) {
        stage('Get a Maven project') {
            git 'https://github.com/tao-zhang/jenkins-dsl-jobs.git'
        }

        stage('Build a Maven project') {
            container('maven') {
                sh 'mvn clean package'
            }
        }
    }
}
