pipelineJob('pipeline-scm') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/tao-zhang/jenkins-dsl-jobs.git')
                    }
                    branch ('master')
                }
            }

            lightweight()
            scriptPath('Jenkinsfile')
        }
    }
}
