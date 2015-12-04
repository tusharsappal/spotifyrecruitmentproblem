#Spotify Client Test Automation Project

### Project Description 
Spotify client Test Automation Project is an automation project that aims to automate general test cases / use cases which the end user encounter when using the Spotify Desktop Application. The project uses Sikuli Automation tool , along with Maven build system to build and manage the dependencies. Also the project uses JUnit as the tool to effectively run , report the test cases . 

The project uses the following set of artifacts and their respective versions as defined in the `pom.xml`

1. `JUnit` having version ``.
2. `sikuli-api` having version ``.
3.    

### Directory Structure of the Project

1. `clientautomation` package under `src/main/java`contains all the test scripts along with the Junit Test Runner and JUnit Test suites.
2.  `configs` package under `src/main/java` contains all the Config files for the project.
3.  `utils` package under `src/main/java` contains all the utility / helper methods whcih are actively used by the test scripts

###Assumptions
1. The user profile is already created .
2. Spotify should be running and streaming data in the country in which the test cases are to be run
3. The User Name field has the value populated already , we will not be touching that instead will be filling up the password field