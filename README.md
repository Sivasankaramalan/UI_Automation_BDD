Android Automation - OkCredit

Appium-cucumber-java-maven
=================

Appium-cucumber : Automation Testing Using Java

Cucumber is a behavior driven development (BDD) approach to write automation test script to test Web and Mobile
It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free.
Automate your test cases with minimal coding.

[More Details](https://sivasankaramalan.bloggi.co/bdd-framework-for-mobile-applications-automation-with-appium)

Documentation
-------------
* [Installation](https://github.com/selenium-cucumber/selenium-cucumber-java/blob/master/doc/installation.md)
* [Predefined steps](https://github.com/selenium-cucumber/selenium-cucumber-java/blob/master/doc/canned_steps.md)

Download Framework
--------------
* Maven - 

Framework Architecture
--------------
	Android_Automation_BDD
		|
		|_src/test/java
		|	|_API
		|	|	|_EndPoints.java
		|	|	|...
		|	|_Driver
		|	|	|_BaseTest.java
		|	|	|_DesiredCapability.java
		|	|	|_PropertyData.java
		|	|	|_Runner.java
		|	|	|...
		|	|_Driver.stepDefs
		|	|	|_APISetpDefinitions.java
		|	|	|_CommonFunctionsStepDefinitions.java
		|	|	|_LoginAndRegistrationFlowStepDefinitions.java
		|	|	|...
		|	|_ObjectRepository
		|	|	|_HomePage_OR.java
		|	|	|...
		|	|_PageObjects
		|	|	|_CommonMethodsFunctions.java
		|	|	|_Random.java
		|	|	|...
		|	|_Utility
		|	|	|_ReadProperties.java
		|	|	|_SetProperties.java
		|	|	|...
		|_src/test/resources
		|	|_features
		|	|	|_001_Sanity.feature
		|	|	|_LoginAndRegistrationFlow.feature
		|	|	|...
		|	|_PropertyFiles
		|	|	|_appConfig.properties
		|	|	|_Configuration.properties
		|	|	|...
		|	|_log4j.properties
		|	|	|...
		|_src/main/java
		|	|_appUnderTest
		|	|	|app.apk
		|	|	|...
		|	|_API
		|	|	|_RestApiConfig.java
		|	|	|...
		|_src/main/resources
		|	|	|...

* **src/test/resources/features** - All the cucumber features files (files .feature ext) goes here.


* **src/test/java/userStepDefinition** - We can define step defintion under this package for our feature steps.


What is Cucumber Feature File?
-----------------------------

	1. Feature File is an entry point to the Cucumber tests.
	2. This is the file where you will describe your tests in Descriptive(Gherkin) language (like English).
	3. It is an essential part of Cucumber, as it serves as an automation test script as well as the live document.
	4. A single feature file can contain one or many scenarios
	
Keywords:
--------

	Feature: Defines what feature you will be testing in the tests below
	Scenario: Defines the scenario that you will test
	Given: Tells the pre-condition of the test
	When:  Defines the condition of the test
	And: Defines additional conditions of the test
	Then: States the postcondition. You can say that it is an expected result of the test.
	
What is Step Definition File?
---------------------------

	A Step Definition is a java method in a class/file with an annotation(like: @Given, @When, @then, etc) attached to it, followed by the pattern(like: “^click on "([^"])"$”).
	This pattern is used to link the Step Definition to all the matching (Gherkin)Steps => this code is what Cucumber would execute when it sees a Gherkin Step. Cucumber finds the Step Definition file with the help of Glue code in Cucumber Options.
	
Cucumber Runner Class:
---------------------

	This class will set up the interaction between the feature file and step definition file.
	
What is Cucumber Options?:
-----------------------

	In layman language @CucumberOptions are like property files or settings for your test. @CucumberOptions enables us to do all the things that we could have done if we have used the cucumber command line.
	This is very helpful and of utmost importance, if we are using IDE such as eclipse only to execute our project.

Parameterization:
----------------

	Parameterization in cucumber is basically done when you have the same scenario but few events are changing, to perform parameterization in cucumber, enter the keyword(event) in double-quotes.
	
Background:
-----------

	Background Keyword is written at the very starting of the feature file, Any statement or group of statements added to the background will execute before the execution of all the scenarios mentioned in that feature file.	


Writing a test
--------------

The cucumber features goes in the `features` library and should have the ".feature" extension.

You can start out by looking at `features/my_first.feature`. You can extend this feature or make your own features using some of the [predefined steps](doc/canned_steps.md) that comes with selenium-cucumber.


Predefined steps
-----------------
By using predefined steps you can automate your test cases more quickly, more efficiently and without much coding.

The predefined steps are located [here](doc/canned_steps.md)

Running test
--------------
Execution Flow:

	Runner class  >>  Feature file  >> Step Definition
	
	Run the Test from the Runner.class. (Run as 'JUnit'  or 'TestNG')

Running test On remote browser/platform
---------------------------------------

To run test on Headspin, browserstack or any other remote Platform you need to create browser config file methodd in  /src/test/java/Driver/DesiredCapability.java.

In that method we need to add all the capabilites of the test and Locator files using Page factory.

To run on Headspin add the method name in BaseTest.java beforeHookfunction() method

* `Kobiton();`

To run on Browserstack add the method name in BaseTest.java beforeHookfunction() method

* `BrowserStack();`

Reference
----------
Appium: https://github.com/appium

Cucumber: https://cucumber.io/

Cucumber Tutorial: http://www.tutorialspoint.com/cucumber/

Appium Desired Capabilities: https://github.com/appium/appium/blob/master/docs/en/writing-running-appium/caps.md



