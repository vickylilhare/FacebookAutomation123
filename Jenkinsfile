pipeline {
    agent any  

    tools {
        maven 'Maven_3.9.11'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/vickylilhare/FacebookAutomation123.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Reports') {
            steps {
                publishHTML(target: [
                    reportDir: 'test-output/ExtendReport',
                    reportFiles: 'Extent.html',
                    reportName: 'Extent Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true
                ])
            }
        }
    }

    post {

        always {
            archiveArtifacts artifacts: '**/test-output/ExtendReport/*.html', fingerprint: true
            junit 'target/surefire-reports/*.xml'
        }

        success {
            emailext(
                to: 'vickychamp71@gmail.com',
                subject: "Build Success: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                mimeType: 'text/html',
                attachLog: true,
                body: """
                <html>
                <body>
                    <p>Hello Team,</p>
                    <p>The latest Jenkins build has completed successfully.</p>
                    <p><b>Project Name:</b> ${env.JOB_NAME}</p>
                    <p><b>Build Number:</b> #${env.BUILD_NUMBER}</p>
                    <p><b>Status:</b> <span style="color:green;"><b>SUCCESS</b></span></p>
                    <p><b>Build URL:</b>
                        <a href="${env.BUILD_URL}">${env.BUILD_URL}</a>
                    </p>
                    <p><b>Extent Report:</b>
                        <a href="${env.BUILD_URL}HTML_20Extent_20Report/">View Report</a>
                    </p>
                    <p>Regards,<br><b>Automation Team</b></p>
                </body>
                </html>
                """
            )
        }

        failure {
            emailext(
                to: 'vickychamp71@gmail.com',
                subject: "Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                mimeType: 'text/html',
                attachLog: true,
                body: """
                <html>
                <body>
                    <p>Hello Team,</p>
                    <p>The latest Jenkins build has <b style="color:red;">FAILED</b>.</p>
                    <p><b>Project Name:</b> ${env.JOB_NAME}</p>
                    <p><b>Build Number:</b> #${env.BUILD_NUMBER}</p>
                    <p><b>Status:</b> <span style="color:red;"><b>FAILED ❌</b></span></p>
                    <p><b>Build URL:</b>
                        <a href="${env.BUILD_URL}">${env.BUILD_URL}</a>
                    </p>
                    <p><b>Extent Report (if generated):</b>
                        <a href="${env.BUILD_URL}HTML_20Extent_20Report/">View Report</a>
                    </p>
                    <p>Please check logs and take action.</p>
                    <p>Regards,<br><b>Automation Team</b></p>
                </body>
                </html>
                """
            )
        }
    }
}
