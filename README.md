# Jenkins DSL Jobs

This is an example project to create jenkins pipelines (script and scm) with the help of [Jenkins Job DSL plugin](https://plugins.jenkins.io/job-dsl/).

[Jenkins Configuration as Code plugin](https://plugins.jenkins.io/configuration-as-code/) is able to finish most Jenkins configuration as code, but not jobs creation. Together with Job DSL plugin, `Jenkins as Code` can be achieved. An example of these two plugins working together can be found [here](https://github.com/tao-zhang/eks/blob/c63e549063f095d502b9977c4ef9d7f0fc19cd53/helm/jenkins/values.yaml#L287).

## Project structure

Under root directory, there is a Maven 'hello world' project. In direcotry `jobs`, you will find 2 jobs defination to build this Maven project.

* pipeline-scm.groovy

  Jenkins pipeline through Jenkinsfile defined in a git SCM.

* pipeline-script.groovy

  Jenkins pipeline through build script inline.
