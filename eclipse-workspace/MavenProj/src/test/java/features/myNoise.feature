
Feature: Open app myNoise

Background: setups
 Given Initilize and setups
 

 
  Scenario: Open app
    Given Open the app
    When open the current section
    Then Choose one section
    And click slider speed
    Then click slider mode
    
    # And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  
 # Scenario Outline: Title of your scenario outline
    #   Given I want to write a step with <name>
    #   When I check for the <value> in step
    #   Then I verify the <status> in step

   #  Examples: 
   #   | name  | value | status  |
   #   | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
