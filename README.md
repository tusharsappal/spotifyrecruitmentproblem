#Spotify Client Test Automation Project

### Project Description 
Spotify client Test Automation Project is an automation project that aims to automate general test cases / use cases which the end user encounter when using the Spotify Desktop Application. The project uses Sikuli Automation tool , along with Maven build system to build and manage the dependencies. Also the project uses JUnit as the tool to effectively run , report the test cases . 

The project uses the following set of artifacts and their respective versions as defined in the `pom.xml`

1. `JUnit` having version `4.4`.
2. `sikuli-api` having version `1.2.0`.
3. `sikulixapi` having version `1.1.0`.
4. `java` having version `1.7 or more`

### Directory Structure of the Project

All the test cases and the necessary utilities and resource files are present under the `test` package.

1. `clientautomation` package under `src/test/java`contains all the test scripts along with the JUnit Test Runner and JUnit Test suites.
2. `configs` package under `src/test/java` contains all the configuration files for the project.
3. `utils` package under `src/test/java` contains all the utility / helper methods which are actively used by the test scripts.
4. `images` folder under `src/test/resources` hosts all the necessary image files required in the form of Patterns for the test cases to run

### Steps to run the Test Cases

As mentioned in the documentation above the different test cases are bundled into a Test Suite named `JUnitTestSuite.java` under the folder structure `src/main/java/clientautomation` . This Test Suite is called through the `TestRunner.java` file present at the same location.

We can run the test cases in two manners.

1. Using IDE (like Eclipse etc) we can right click on the Test Runner file like JUnitTestSuite.java or TestRunner.java that will be running all of the test scripts. To run individual scripts just right click on the Test Script and run it as JUnit Test Case.

2. Through Command line using the Maven Build Ecosystem , since the project is Apache Maven based we can run all the test cases using the single command `mvn test` or `mvn clean install` . It basically fires up all the test cases listed under the `src/test/java` folder.

###Assumptions

1. The user profile is already created .
2. Spotify should be running and streaming data in the country in which the test cases are to be run.
3. The User Name field has the value populated already , we will not be touching that instead will be filling up the password field to login.
4. The Sikuli and the JUnit dependencies are already built into the system on which the test scripts are to be run.
5. The test case assumes that the login , Desktop client , Spotify's back-end functionalities to work at the time when the test case runs.
6. We assume that UI Rendering and Opening of tabs , logging in etc takes around 3 seconds at max and we have defined that value as the deafult waiting time in the Configs.

### Project Author

1. Tushar Sappal (sappal.tushar@gmail.com)