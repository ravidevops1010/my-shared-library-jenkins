def call() {

    sh 'dotnet publish -o ./artifacts'  
    archiveArtifacts './artifacts'
   
}