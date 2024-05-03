def call() {
   sh 'dotnet restore'
   sh 'dotnet build -c Release' 
   
}