Feature: LogIn Page

@logIn
Scenario Outline: Validating user cannot logIn with invalid credentials
Given User navigates to "https://www.phptravels.com/demo"
When User clicks on LogIn button
And Enters "<Email>", "<Password>"
And clicks LogInButton
Then User should receive error message

Examples:
|	Email							|	Password	|
|	email@email1.com	|	Password1	|
|	email@email2.com	|	Password2	|



