#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Login Feature
  The feature is used to test the login functionality

  @positive
  Scenario: Validate login process
  
    Given I am on the login page
    
    When I enter "<userName>" & "<password>"
   
    Then I should successfuly login
    
    
        Examples:
      | userName | password | 
      | ram@123@gmail.com | pass123 |
      | userer32333@gmail.com | try$123 |
      | name2 | ytyqax@3 |

