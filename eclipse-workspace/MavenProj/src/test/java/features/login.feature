
Feature: Login to swaglabs
 

  
  Scenario: login with valid creadentials
    Given Login page is open 
    When User inserts valid credentials and click login 
    Then User logs in and home page should open
   

 