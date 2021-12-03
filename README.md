# Automation_Code_Challenge

This project automates the website -  http://automationpractice.com for the below scenarios,

1. Update firstname in the Personal Information Section of my account.
2. Order a T-Shirt and verify in order history

The automation test scripts are written using below framework/tools,

1. Cucumber JVM
2. Selenium WebDriver
3. Maven

## Prerequisites

1. JAVA
2. Maven
3. Eclipse IDE - Cucumber and Maven Plugins

### Setting up the project

1. Install Java and set path.
2. Install Maven and set path.

## Features
Cucumber features are located in the src/test/java/features where the test data is mapped with the scenarios in BDD Gherkin format.

### Running the features 

1. Goto project directory.
2. Use "mvn test" command to run features.
3. Use "mvn test -Dbrowser=browser_name" to run features on specific browser.

### Test Reporting

Test Reports are generated using Extent Reports.

1. Goto project directory.
2. Go to test-result directory

A sample test run report is shared in this project.
