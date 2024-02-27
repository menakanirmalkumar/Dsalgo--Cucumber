@linkedlisttest
Feature: Ds_algo project-Linked Lists functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page
    Then user is successfully signin

  Scenario: Search the Linked List practice Question to practice Linked Lists
    When the user clicking Getstarted button in homepage Linked List section
    Then the user navigate to Introduction in Linked List Home page
    Then the user navigate to LL Practice Questions page

  #LinkedList Page Navigation
  Scenario Outline: To validate if user successfully running the python code in all LinkedList Pages
    When the user clicking Getstarted button in homepage Linked List section
    Then the user navigate to operation in '<OperationSpecific>' LLPage
    Then the user clicks tryhere button and navigate to try editor page
    Then the user validating the python code with '<Pycode>'

    Examples: 
      | OperationSpecific     | Pycode                 |
      | Introduction          | print("Hello, World!") |
      | Creating Linked List  | print("Hello, World!") |
      | Types of Linked List  | print("Hello, World!") |
      | Implement Linked List | print("Hello, World!") |
      | Traversal             | print("Hello, World!") |
      | Insertion             | print("Hello, World!") |
      | Deletion              | print("Hello, World!") |
      | Introduction          | Hello                  |
      | Creating Linked List  | Hello                  |
      | Types of Linked List  | Hello                  |
      | Implement Linked List | Hello                  |
      | Traversal             | Hello                  |
      | Insertion             | Hello                  |
      | Deletion              | Hello                  |
