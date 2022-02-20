def call () {
stage('Build')
        {   steps{
            mavenBuild()
        }
          }

        stage('test')
        {
            steps{
                sh 'mvn test'
            }
        }
}
