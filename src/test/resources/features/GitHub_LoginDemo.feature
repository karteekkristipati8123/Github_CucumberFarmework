Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on the login page
    When user enters <username> and <password>
    And clicks login button
    #Then user should be logged in

    Examples: 
      | username                       | password           |
      | karthikkristipati123@gmail.com | Karthik@github8123 |
  