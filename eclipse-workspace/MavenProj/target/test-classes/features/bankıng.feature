

Feature: Banking application money movements
  I want to use this template for my feature file

  
  Scenario: Money deposit
    Given User account exists with 1000 dollars in it
    And User has access to his account
    When User logs in to the bank app 
    And User opens money deposit page
    And User deposits check for 2000 dollars
    Then Page displays the confirmation of the deposit
    And Balance shouldd get incremented to 2000 dollars 

 