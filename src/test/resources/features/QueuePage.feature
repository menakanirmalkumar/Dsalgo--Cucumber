@QueuetestOptimize
Feature: Ds_algo project-Queue functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page
    Then user is successfully signin

  #Practice Questions
  Scenario: practice Question to practice Queue
    When the user clicking Getstartedbutton in homepage Queue section
    Then the user navigate to Implementation of Queue in Python page
    Then the user navigate to Queue Practice Questions
    Then User dont have Practice Questions on practice page

  #Queue Page Navigation
  Scenario Outline: To validate if user successfully running the python code in Implementation of Queue in Python page
    When the user clicking Getstartedbutton in homepage Queue section
    Then the user navigate to operation in '<OperationSpecific>' QueuePage
    Then the user clicks tryhere button and navigate to try editor page
    Then the user validating the python code with '<Pycode>'

    Examples: 
      | OperationSpecific                      | Pycode                 |
      | Implementation of Queue in Python      | print("Hello, World!") |
      | Implementation using collections.deque | print("Hello, World!") |
      | Implementation using array             | print("Hello, World!") |
      | Queue Operations                       | print("Hello, World!") |
      | Implementation of Queue in Python      | Hello                  |
      | Implementation using collections.deque | Hello                  |
      | Implementation using array             | Hello                  |
      | Queue Operations                       | Hello                  |
