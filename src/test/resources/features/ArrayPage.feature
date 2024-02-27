@arraytest
Feature: Ds_algo project-Arrays functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page
    Then user is successfully signin

  #Practice Questions -Search the array
  #Scenario: Search the array practice Question to practice Arrays
    #When the user clicking Getstartedbutton in homepage Array section
    #Then the user navigate to Arrays in Python page
    #Then the user navigate to Array Practice Questions
    #And the User navigates to Search the array question
    #Then the user validating the python code and submit the answer and get the ErrorMessage

  #Practice Questions -Max Consecutive Ones
  #Scenario: Search the array practice Question to practice Arrays
    #When the user clicking Getstartedbutton in homepage Array section
    #Then the user navigate to Arrays in Python page
    #Then the user navigate to Array Practice Questions
    #And the User navigates to Max Consecutive Ones question
    #Then the user validating the python code and submit the answer and get the ErrorMessage
#
  #Practice Questions -Find Numbers with Even Number of Digits
  #Scenario: Search the array practice Question to practice Arrays
    #When the user clicking Getstartedbutton in homepage Array section
    #Then the user navigate to Arrays in Python page
    #Then the user navigate to Array Practice Questions
    #And the User navigates to Find Numbers with Even Number of Digits question
    #Then the user validating the python code and submit the answer and get the ErrorMessage

  #Practice Questions -Squares of a Sorted Array
  Scenario: Search the array practice Question to practice Arrays
    When the user clicking Getstartedbutton in homepage Array section
    Then the user navigate to Arrays in Python page
    Then the user navigate to Array Practice Questions
    And the User navigates to Squares of a Sorted Array question
    Then the user validating the python code and submit the answer

  #Array Page Navigation
  Scenario Outline: To validate if user successfully running the python code in all Array Pages
    When the user clicking Getstartedbutton in homepage Array section
    Then the user navigate to operation in '<OperationSpecific>' ArrayPage
    Then the user clicks tryhere button and navigate to try editor page
    Then the user validating the python code with '<Pycode>'

    Examples: 
      | OperationSpecific         | Pycode                 |
      | Arrays in Python          | print("Hello, World!") |
      | Arrays Using List         | print("Hello, World!") |
      | Basic Operations in Lists | print("Hello, World!") |
      | Applications of Array     | print("Hello, World!") |
      | Arrays in Python          | Hello                  |
      | Arrays Using List         | Hello                  |
      | Basic Operations in Lists | Hello                  |
      | Applications of Array     | Hello                  |
