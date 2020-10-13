library identifier: 'custom-lib@master', retriever: modernSCM(
  [$class: 'GitSCMSource',
   remote: 'https://github.com/mkthakral/jenkins-gy.git',
   extensions: [
        [$class: 'SparseCheckoutPaths',  sparseCheckoutPaths:[[$class:'SparseCheckoutPath', path:'gyecomm/']]]
                ]
   ])

node{
    stage('StopHybris') {
        stopHybris(
            environment: ${environment}
        ) 
    }
    
}