def call() {

    sh 'dotnet pack -c Release --no-build --output ./artifacts'  
    archiveArtifacts './artifacts'
   
}