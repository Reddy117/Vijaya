@tag
Feature: Kart
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Verify product in kart
    Given go to website and login using "<UserName>" and "<Password>"
    When add product to kart using "<Size>" and "<Qty>"
    Then prduct should be added to kart

    Examples: 
      | UserName               | Password       | Size | Qty |
      | gogi.reddyqa@gmail.com | anishsaireddy8 | L    |   2 |
      | gogi.reddyqa@gmail.com | anishsaireddy8 | S    |   3 |
      
   Scenario Outline: Remove productfromKart
       Given go to website and login using "<UserName>" and "<Password>"
       
