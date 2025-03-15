Feature: 
Scenario: To check login functionality of the application
Given User open the browser
And User navigate to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" webpage
When User enters the login credentials
|TestData.xlsx|
And User clicks on the login button
Then User verifies the profile account
And User closes the browser

