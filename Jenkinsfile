@Library("shared_library_welcome") _
pipeline {
    agent any
    stages {
          stage("checkout")
          {
              steps {
                 echo "calling the checkout stage"
              }
          }
          
          stage("build")
          {
              steps {
                  echo " calling the build stage"
              }
          }
          
           stage("calling shared library")
          {
              steps {
                  
                  script
                  {
                    welcome("sudhakaran")
                    calculator.add(10,5)
                    calculator.sub(10,5)
                    calculator.mul(10,5)
                    calculator.div(10,5)
                  }
                  
              }
          }
          
          stage("deploy")
          {
              steps {
                         echo " calling the deploy stage "
              }
          }
        stage("notifyBuild")
          {
              steps {
                         echo " calling the deploy stage "
                         script
                         {
                             mail_notify("murusudha@gmail.com")
                             scripts=load "mail_notify.groovy"  
                         }
              }
          }  
    }
}
