pipeline {  
    agent any  
    stages {  
            stage ('Build') {  
                steps {  
                        echo 'Running build phase...'  
                }  
            }  
            stage ('Deploy') {  
                steps {  
                        echo 'Running deploy phase...'  
                }  
            } 
            stage ('test') {  
                steps {  
                        echo 'Running test phase...'  
                }  
            }  
            stage ('jenkinspipeline') {  
                steps {  
                        echo 'Running git phase...'  
                        git 'https://github.com/Abhilash-1201/Java-Programes.git'
                        
                }  
            }  
            stage ('git') {  
                steps {  
                        echo 'Running git phase...'  
                       
                        
                }  
            }  
    }  
}  
