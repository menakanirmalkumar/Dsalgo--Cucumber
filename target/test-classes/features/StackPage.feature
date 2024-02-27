@stacktestOptimize
Feature: Ds_algo project-Stack functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page
    Then user is successfully signin

  Scenario Outline: To validate if user getting error message when enter valid python code in operations stack page
    When the user clicking Getstartedbutton in homepage stack section
    Then the user navigate to operation in '<OperationSpecific>' page
    Then the user clicks tryhere button and navigate to try editor page
    Then the user validating the python code with '<Pycode>'

    Examples: 
      | OperationSpecific | Pycode                 |
      | stack             | print("Hello, World!") |
      | implementation    | print("Hello, World!") |
      | Applications      | print("Hello, World!") |
      | stack             | Hello                  |
      | implementation    | Hello                  |
      | Applications      | Hello                  |
