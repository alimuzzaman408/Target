Feature:Purchase product from online
Background:
  Given Customer on the home page

  @TSmokeTesting
  Scenario: Customer able to select milk item from grocery categories
    When Navigate to milk page from categories
    Then Customer will be on Milk Page

  @sanityTesting
  Scenario: Customer able to select cheese item from grocery categories
    When Navigate to cheese page from categories
    Then Customer will be on cheese Page

  @smokeTesting
  Scenario: Customer able to select yogurt item from grocery categories
    When Navigate to yogurt page from categories
    Then Customer will be on yogurt Page

  @sanityTesting
  Scenario: Customer able to select coffee_creamer item from grocery categories
    When Navigate to coffee_creamer page from categories
    Then Customer will be on coffee_creamer Page

  @smokeTesting
  Scenario: Customer able to select Cream_cheese item from grocery categories
    When Navigate to Cream_cheese page from categories
    Then Customer will be on Cream_cheese Page

  @sanityTesting
  Scenario: Customer able to select soap item from household categories
    When Navigate to soap page from categories
    Then Customer will be on soap Page

  @smokeTesting
  Scenario: Customer able to select sanitizer item from household categories
    When Navigate to sanitizer page from categories
    Then Customer will be on sanitizer Page

  @sanityTesting
  Scenario: Customer able to select toilet_paper item from household categories
    When Navigate to toilet_paper page from categories
    Then Customer will be on toilet_paper Page

  @smokeTesting
  Scenario: Customer able to select cleaning_supplies item from household categories
    When Navigate to cleaning_wipes page from categories
    Then Customer will be on cleaning_wipes Page

  @sanityTesting
  Scenario: Customer able to select floor_care item from household categories
    When Navigate to floor_care page from categories
    Then Customer will be on floor_care Page

  @NegativeTesting
  Scenario Outline: User can able to login with invalid credential
      When user click sign_in from menu button
      And user enters "<username>" and password "<password>"
      And click sign in
      Then user should be on account page

      Examples:
      |username|password|
     | alimuzzaman408@yahoo.com| a123456|
     | alimuzzaman408@gmail.com| b123456|
     | alimuzzaman408@yahoo.com| a123476|
     | alimuzzaman40@gmail.com| a123476|













