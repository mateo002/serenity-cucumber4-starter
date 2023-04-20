Feature:Login into the application

  Scenario Outline: Successful login
    Given <name> <email> <clave> has an active account
    When he sends his valid credentials
    Then he should have access to manage his account
    Examples:
      | name | email | clave |
      | Pepito | standard_user | secret_sauce |
