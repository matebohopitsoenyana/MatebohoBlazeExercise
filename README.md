# XYZ Banking Application (BlazeExercise) Automation Framework

**Overview**
This repository contains an end-to-end automation framework developed using Cucumber to automate testing of a banking web application. The project focuses on automating critical banking workflows such as login, deposit, withdrawal, and transaction history to ensure the stability and reliability of the application.

The framework follows Object-Oriented Programming (OOP) principles and uses the Page Object Model (POM) design pattern to make it maintainable and scalable.

**Key features of the framework include:**
- Automated test cases for deposit, withdrawal, login, and transaction validation.
- Allure Reporting for detailed, visually rich test reports with screenshots on failure.
- Integration with CI/CD pipeline for continuous test execution.
**Features**
- Cucumber: For writing Behavior-Driven Development (BDD) style test scenarios using Gherkin syntax.
- Allure Report: Rich test reports with execution details and screenshots.
- GitHub: For version control and collaboration.
- CI/CD integration for automated execution.

**Setup and Installation
Prerequisites**
Ensure you have the following installed on your system:
1. Git (Download and install from git-scm.com)
2. Maven
3. Java
4. Allure
5. IDE of your choice, e.g. IntelliJ

**Test Scenarios Implemented
The following test scenarios are automated in this project:**

Login as a Customer and Deposit:

Log in as a customer.
Deposit 1500 into the first account.
Validate that the deposit was successful.
Login and Deposit into Multiple Accounts:

Log in as a customer.
Deposit 1500 into each account (supports multiple accounts).
Validate the deposit was successful for each account.
Deposit, Withdraw, and Transaction Validation:

Log in as a customer.
Deposit 31459 into the first account and validate the deposit.
Open transaction history and validate that the transaction appears.
Withdraw 31459 from the account and validate the balance has returned to the original amount.
Validate transaction history after withdrawal.
Reporting
The framework uses Allure Reporting for generating rich test reports, which include:
Execution status (Pass/Fail).
Screenshots captured on test failure.
Detailed logs for debugging.
