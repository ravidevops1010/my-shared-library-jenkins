def call() {
   sh 'dotnet restore *.sln'
   sh 'dotnet build -c Release' 
   
}