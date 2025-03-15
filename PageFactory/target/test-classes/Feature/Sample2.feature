Feature:
Background: 
Given User open the browser
And User navigate to the "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" webpage

@SmokeTest

Scenario: To check title of the application
Then User verifies the title of the webpage
And User closes the browser

@SystemTest

Scenario Outline: To check login functionality of the application
When User enters '<Username>' the username
And User enters '<Password>' the password
And User clicks on the login button
Then User verifies the profile account
And User closes the browser
Examples: 
|Username | Password|
|Admin|admin123|
|Admin|admin123|