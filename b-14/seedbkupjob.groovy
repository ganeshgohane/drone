pipelineJob('scriptedpipelines_converted') {

  description('')

  displayName('scriptedpipelines_converted')

  configure { flowdefinition ->

    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@2725.v7b_c717eb_12ce') {

      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {

        'configVersion'(2)

        'userRemoteConfigs' {

          'hudson.plugins.git.UserRemoteConfig' {

            'url'('https://github.com/ganeshgohane/b-14.git')

            'credentialsId'('github-user-pswd')

          }

        }

        'branches' {

          'hudson.plugins.git.BranchSpec' {

            'name'('*/master')

          }

        }

        'doGenerateSubmoduleConfigurations'(false)

        'submoduleCfg'(class:'empty-list')

        'extensions'()

      }

      'scriptPath'('pipeline/scripted.groovy')

      'lightweight'(true)

    }

  }

}
