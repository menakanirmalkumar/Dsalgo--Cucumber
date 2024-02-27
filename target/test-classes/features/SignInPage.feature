@SignInPage
Feature: Ds_algo project - Signin Functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page

  Scenario Outline: To validate if user is successfully Signin.
    Given the user is on the Signin page
    When the user enters valid credentials '<Uname>' and '<Pwd>'
    Then the user signin Successfully

    Examples: 
      | Uname                       | Pwd      |
      | projectpractice70@gmail.com | Test@123 |
      | projectpractice71@gmail.com | Test@123 |

  Scenario Outline: To validate if user is not successfully Signin.
    Given the user is on the Signin page
    When the user enters valid credentials '<Uname>' and '<Pwd>'
    Then the user not successfully signin

    Examples: 
      | Uname                       | Pwd      |
      | projectpractice70@gmail.com | Test@12  |
      | projectpracti@gmail.com     | Test@123 |
