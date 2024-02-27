@datastructures
Feature: Ds_algo project-Data Structures functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page
    Then user is successfully signin

  Scenario: Search the Data Structures practice Question to practice Data Structures
    When the user clicking Getstarted button in homepage Data Structures section
    Then the user navigate to Time Complexity from DS Home page
    Then the user navigate to Practice Questions page

  #Data Structures in Time Complexity
  Scenario Outline: To validate if user successfully running the python code in all Data Structures Pages
    When the user clicking Getstarted button in homepage Data Structures section
    Then the user navigate to operation in '<OperationSpecific>' DSPage
    Then the user clicks tryhere button and navigate to try editor page
    Then the user validating the python code with '<Pycode>'

    Examples: 
      | OperationSpecific | Pycode                 |
      | Time Complexity   | print("Hello, World!") |
      | Time Complexity   | Hello                  |
