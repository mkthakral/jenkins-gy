@Library('pipeline-library-gy')_

node{
    stage('StopHybris') {
        stopHybris1(
            environment: "${env.environment}"
        )
    stage('Checkout'){
        gitClone1(
            branch: "${env.branch}",
            repoURL: "https://gitlab.digitas.com/goodyear/goodyear-ecommerce.git"
            )
    }

}