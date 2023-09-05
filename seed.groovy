organizationFolder('sinajmon') {
    configure {
        it / navigators / "sinajmon.jenkinsci.plugins.github__branch__source.GitHubSCMNavigator" << {
            repoOwner("sinajmon")
            apiUri("https://api.github.com")
            credentialsId("DevopsOrganise")
        }
    }
    configure {
        it / projectFactories / "sinajmon.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProjectFactory" << {
            scriptPath("Jenkinsfile")
        }
    }
}
