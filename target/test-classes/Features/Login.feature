Feature: Application Login

Scenario: Home Page default login
Given User needs to be on landing page
When User enters username and password
And clicks on Enter
Then home page should get loaded
And Cards are displayed
