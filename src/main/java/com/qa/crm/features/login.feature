Feature: Login feature

Scenario: Verify the Login fuctionality

Given Browser opened
Then Verify the login title
When User entered Username and Password
And User clicked on Login Button
And Home page title got verified
Then Browser closed

Scenario: Verify Home Page
Given Home page loaded
Then Required labels are displayed
When Click on Contacts lable
