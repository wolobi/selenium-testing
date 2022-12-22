pipeline{
    agent any
    stages{
        stage("test"){
            steps{
                
                bat'mvn clean compile test'
            
            }
            post{
                success{
                    echo "========Test executed successfully========"
                }
                failure{
                    echo "========Test execution failed========"
                }
            }
        }
    }
    post{
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}