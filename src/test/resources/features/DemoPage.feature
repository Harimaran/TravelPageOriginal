Feature:  Demo Homepage

@demoPage @menu
Scenario: Validate all menu options are present in demo-page
Given User navigates to "https://www.phptravels.com/demo"
When Page loads completely
Then User should see all the available options

@newsletter
Scenario: Validate user can subscribe to Newsletter
Given User navigates to "https://www.phptravels.com/demo"
When User enters "mail@gmail.com"
And clicks subscribe button
Then Newsletter should be subscribed

@demoReq
Scenario: Validate user can request for demo with valid details
Given User navigates to "https://www.phptravels.com/demo"
When User enters below information
|	firstName			|	Hari				|
|	lastName			|	gates				|
|	businessName	|	hgates			|
|	email					|	mail@hg.com	|

And clicks subscribe button
Then Newsletter should be subscribed


