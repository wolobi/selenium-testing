pipeline{
    agent any
    stages{
        stage("BranchMain"){
                when{
                    branch '/main'
                }
            steps{
                echo "========Echo BranchMain========"
            }
            post{
                success{
                    echo "========BranchMain executed successfully========"
                }
                failure{
                    echo "========BranchMain execution failed========"
                }
            }
        }
        stage("BranchDev"){
                when{
                    not{
                        branch 'dev'
                    }
                }
            steps{
                echo "========Echo BranchDev========"
            }
            post{
                success{
                    echo "========BranchDev executed successfully========"
                }
                failure{
                    echo "========BranchDev execution failed========"
                }
            }
        }
        stage("One"){
            steps{
                echo "========Echo One======== "
            }
            post{
                success{
                    echo "========One executed successfully========"
                }
                failure{
                    echo "========One execution failed========"
                }
            }
        }
        stage("Two"){
            steps{
                echo "====++++Echo Two++++===="
            }
            post{
                success{
                    echo "====++++Two executed successfully++++===="
                }
                failure{
                    echo "====++++Two execution failed++++===="
                }
        
            }
        }
        stage("Three"){
            steps{
                input('¿Quieres proceder con el despliegue?')
            }
            post{
                success{
                    echo "====++++Three executed successfully++++===="
                }
                failure{
                    echo "====++++Three execution failed++++===="
                }
        
            }
        }
        stage("Four"){
            steps{
                echo "Desplegando aplicación"
            }
            post{
                success{
                    echo "====++++Despliegue executed successfully++++===="
                }
                failure{
                    echo "====++++Despliegue execution failed++++===="
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