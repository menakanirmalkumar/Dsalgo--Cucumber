@Treetest
Feature: Ds_algo project-Tree functionality

  Background: User is Navigating to HomePage
    Given Launch the Portal Page
    When Navigate to Home page
    Then user is successfully signin

  #Practice Questions
  Scenario: practice Question to practice Tree
    When the user clicking Getstartedbutton in homepage Tree section
    Then the user navigate to Overview of Trees page
    Then the user navigate to Trees Practice Questions
    Then User dont have Practice Questions on practice page

  #Tree Page Navigation
  Scenario Outline: To validate if user successfully running the python code in all Tree Pages
    When the user clicking Getstartedbutton in homepage Tree section
    Then the user navigate to operation in '<OperationSpecific>' TreePage
    Then the user clicks tryhere button and navigate to try editor page
    Then the user validating the python code with '<Pycode>'

    Examples: 
      | OperationSpecific              | Pycode                 |
      | Overview of Trees              | print("Hello, World!") |
      | Terminologies                  | print("Hello, World!") |
      | Types of Trees                 | print("Hello, World!") |
      | Tree Traversals                | print("Hello, World!") |
      | Traversals-Illustration        | print("Hello, World!") |
      | Binary Trees                   | print("Hello, World!") |
      | Implementation of Binary Trees | print("Hello, World!") |
      | Applications of Binary trees   | print("Hello, World!") |
      | Binary Search Trees            | print("Hello, World!") |
      | Implementation Of BST          | print("Hello, World!") |
      | Overview of Trees              | Hello                  |
      | Terminologies                  | Hello                  |
      | Types of Trees                 | Hello                  |
      | Tree Traversals                | Hello                  |
      | Traversals-Illustration        | Hello                  |
      | Binary Trees                   | Hello                  |
      | Implementation of Binary Trees | Hello                  |
      | Applications of Binary trees   | Hello                  |
      | Binary Search Trees            | Hello                  |
      | Implementation Of BST          | Hello                  |
      
    
