def call(mailid)
{
  notifyBuild(mailid)
}

def notifyBuild(String buildStatus = 'STARTED',String mailid) 
{
  buildStatus =  buildStatus ?: 'SUCCESSFUL'

    env.BuildResult = "${currentBuild.currentResult}"

    if (buildStatus == 'SUCCESSFUL'){
            emailext (
            to: mailid,
            subject: 'Build Success',
            body: """Job Status: Success
            Project: Test
            Environment: Dev
            Package Name: ${env.package} 
            Build Log: ${env.BUILD_URL}"""
            )
    }
    
    else {
            emailext (
            to: mailid,
            subject: 'Build Failed',
            body: """Job Status: Failed
            Project: Test
            Environment: Dev
            Build Log: ${env.BUILD_URL}"""
            )
    } 
    
}
