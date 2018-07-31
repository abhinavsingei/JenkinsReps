Feature: Login

In order to login to newtours
As a User
I need to register First

Business Rules:
- Registered user can only do the transactions
Scenario: User can do the sucessful login
Given user is on the login page of newtours
When user enters correct crredentials in newtours
Then user can do sucessful login