@RegTest
Feature: Registration Functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page

  @validregisterexec
  Scenario: To validate if  the newuser is successfully Register.
    Given the user is on the registration page
    When the user newly registered

  @invalidregisterexec
  Scenario Outline: To validate if  the exsisting user not sucessfully Register.
    Given the user is on the registration page
    When the exsisting user access the Registerpage it should display error message'<Uname>' and '<Pwd>'

    Examples: 
      | Uname                       | Pwd      |
      | Projectpractice68@gamil.com | test@123 |
