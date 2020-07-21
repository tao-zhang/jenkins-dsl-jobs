organizationFolder("github") {
  organizations {
    github {
      repoOwner("tao-zhang")
      credentialsId("github")

      traits {
        gitHubBranchDiscovery {
          strategyId(0)
        }
        gitHubPullRequestDiscovery {
          strategyId(0)
        }
      }
    }
  }
}
