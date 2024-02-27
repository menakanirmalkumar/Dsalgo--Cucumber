@graphtest
Feature: Ds_algo project-Graph functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page
    Then user is successfully signin

  #Practice Questions
  Scenario: practice Question to practice Graph
    When the user clicking Getstartedbutton in homepage Graph section
    Then the user navigate to Graph page
    Then the user navigate to Graph Practice Questions
    Then User dont have Practice Questions on practice page

  #Graph Page Navigation
  Scenario Outline: To validate if user successfully running the python code in all Graph Pages
    When the user clicking Getstartedbutton in homepage Graph section
    Then the user navigate to operation in '<OperationSpecific>' GraphPage
    Then the user clicks tryhere button and navigate to try editor page
    Then the user validating the python code with '<Pycode>'

    Examples: 
      | OperationSpecific         | Pycode                 |
      | Graph                     | print("Hello, World!") |
      | Graph Representations     | print("Hello, World!") |
      | Graph                     | Hello                  |
      | Graph Representations     | Hello                  |
