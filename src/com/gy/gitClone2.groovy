package com.gy

def cloneRepository(String branchName, String repoURL) {
    def checkoutDir = "${env.WORKSPACE}/Code/Hybris"
    
    printf "checkoutDir: " + checkoutDir
    printf "branchName: " + branchName
    printf "repoURL: " + repoURL

    dir(checkoutDir) {
        checkout([
            $class: 'GitSCM',
            branches: [[name:  branchName ]],
            userRemoteConfigs: [[ credentialsId: "gitlab2", url: repoURL ]]
        ])
    }
}
