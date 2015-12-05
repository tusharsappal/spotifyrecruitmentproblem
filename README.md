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

I can run the test cases in two manners.

1. Using IDE (like Eclipse etc) I can right click on the Test Runner file like JUnitTestSuite.java or TestRunner.java that will be running all of the test scripts. To run individual scripts just right click on the Test Script and run it as JUnit Test Case.

2. Through Command line using the Maven Build Ecosystem , since the project is Apache Maven based I can run all the test cases using the single command `mvn test` or `mvn clean install` . It basically fires up all the test cases listed under the `src/test/java` folder.

###Assumptions

1. The user profile is already created .
2. Spotify should be running and streaming data in the country in which the test cases are to be run.
3. The User Name field has the value populated already , I will not be touching that instead will be filling up the password field to login.
4. The Sikuli and the JUnit dependencies are already built into the system on which the test scripts are to be run.
5. Maven Home and correct Java Version (java 1.7+) is installed and correctly configured.
6. The test case assumes that the login , Desktop client , Spotify's back-end functionalities to work at the time when the test case runs.
7. I assume that UI Rendering and Opening of tabs , logging in  and other actions takes around 3 seconds at max and I have defined that value as the deafult waiting time in the Configuration file.
8. I have written a single test case around the workflow , like for the login workflow using the valid Credentials there can be many test cases like checking for the upper limit of the user name , password and with what all different characters one can use to form the password.


### Special Test Case that was Automated
I added a special Test case around __New Play List Creation__ in the test script `TestNewPlayListCreation.java`. Since Spotify is a music sreaming app and it out of bo support different compilation of songs , the user is actively involved in creating his / her own mix /collection of songs bundled in the form of playlist for different occasions like a user can create a playlist for running / gym or he / she can create one for office work.

Since this feature is very actively used , I chose this workflow to automate.
 
### Project Author

1. Tushar Sappal (sappal.tushar@gmail.com)