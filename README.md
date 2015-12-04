#Spotify Client Test Automation Project

### Project Description 
Spotify client Test Automation Project is an automation project that aims to automate general test cases / use cases which the end user encounter when using the Spotify Desktop Application. The project uses Sikuli Automation tool , along with Maven build system to build and manage the dependencies. Also the project uses JUnit as the tool to effectively run , report the test cases . 

The project uses the following set of artifacts and their respective versions as defined in the `pom.xml`

1. `JUnit` having version `4.4`.
2. `sikuli-api` having version `1.2.0`.
3. `sikulixapi` having version `1.1.0`.
4. `java` having version `1.7 or more`

### Directory Structure of the Project

1. `clientautomation` package under `src/main/java`contains all the test scripts along with the JUnit Test Runner and JUnit Test suites.
2. `configs` package under `src/main/java` contains all the configuration files for the project.
3. `utils` package under `src/main/java` contains all the utility / helper methods which are actively used by the test scripts.
4. `images` folder under `src/main/resources` hosts all the necessary image files required in the form of Patterns for the test cases to run

### Steps to run the Test Cases

As mentioned in the documentation above the different test cases are bundled into a Test Suite named `JUnitTestSuite.java` under the folder structure `src/main/java/clientautomation` . This Test Suite is called through the `TestRunner.java` file present at the same location.

We can run the test cases in two manners.

1. Using IDE (like Eclipse etc)

###Assumptions

1. The user profile is already created .
2. Spotify should be running and streaming data in the country in which the test cases are to be run.
3. The User Name field has the value populated already , we will not be touching that instead will be filling up the password field to login.
4. The Sikuli and the JUnit dependencies are already built into the system on which the test scripts are to be run.
5. The test case assumes that the login , Desktop client , Spotify's back-end functionalities to work at the time when the test case runs.
6. 

### Project Author

1. Tushar Sappal (sappal.tushar@gmail.com)