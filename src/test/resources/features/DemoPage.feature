Feature:  Demo Homepage

@demoPage
Scenario: Validate all menu options are present in demo-page
Given User navigates to "https://www.phptravels.com/demo"
When Page loads completely
Then User should see all the available options