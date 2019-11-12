Feature:Customer is going to search for Vegetables and Proceed to Checkout
  Scenario: Search for Items and Validate the Results
    Given User is will navigate to the Website
    When User searches for "Carrot"
    Then "Carrot" result is displayed

    @last
    Scenario Outline: Search for items and then move to the checkout
      Given User will navigate to the Website
      When User searched for "<Name>" Vegetable
      And  Added items to the cart
      And User proceed to the checkOut Page
      Then Verify selected "<Name>" items are displayed in the Checkout Page
      Examples:
      |Name|
      |Brinjal|
      |Beetroot|

      @laast
      Scenario: Add 2 or more items to the car and validate results
        Given User will navigate to the Website
        When User added more than one item to the cart
        Then  User proceed to the checkOut Page
        And verify seleceted items are displayed in the checkout page



