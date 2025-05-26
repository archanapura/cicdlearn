pipeline {
    agent any
    environment {
        // Define environment variables if needed
        MAVEN_OPTS = "-Dmaven.test.failure.ignore=false"
     //   MY_SECRET = credentials('3ef12cb1-c010-470c-a969-f9e5ceca1de4') // Replace with your actual ID
    }
    parameters {
        string(name: 'filename', defaultValue: 'testng.xml', description: 'Enter filename')
    }
    stages {
    //    stage('Login') {
    //  steps {
    //    echo "Logging in with $MY_SECRET" // Username:Password, masked
    //  }
    //}
        stage('Checkout Code') {
            steps {
              
                echo 'Checking out source code...'
                git branch: 'new', url: 'https://github.com/archanapura/cicdlearn.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                echo 'Installing project dependencies...'
                sh 'mvn clean install -DskipTests=true'
            }
        }

        stage('Run Tests') {
            steps {
                script{
                def file = params.filename
                echo 'Running automated tests...'
                sh 'mvn test -D file=${file}'
                }
            }
        }
       
    }

    post {
        always {
            echo 'Cleaning up workspace...'
            cleanWs()
        }

        success {
            echo 'Build and tests succeeded!'
        }

        failure {
            echo 'Build or tests failed!'
        }
    }
}
