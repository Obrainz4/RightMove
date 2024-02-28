Feature: Search
@exclude
  Scenario Outline: User can search for a rent apartment
    Given I  navigate to homepage
    And I type the "<NameOfPlace>" in the search field
    And I click on the Rent button
    When I select "<SearchRadius>" in search radius
    And I select "<MinPrice>" as min price
    And I select "<MaxPrice>" as max price
    And I select "<MinBed>" as min No. of Bedrooms
    And I select "<MaxBed>" as max No. of Bedrooms
    And I select "<PropertyType>" in Property type
    And I select "<AddedToSite>" in Added to site field
    And I click on Find Properties button
    Then the search result page is displayed

   Examples:
    |NameOfPlace|SearchRadius|MinPrice|MaxPrice|MinBed|MaxBed|PropertyType        |AddedToSite|
    |London     |Within 15 miles|600 PCM|900 PCM|3    |5     |Flats / Apartments  |Anytime    |
    |Manchester |Within 30 miles|300 PCM|500 PCM|1      |4     |Houses              |Anytime    |


    Scenario: User can move to Buy menu and click any option
      Given I  navigate to homepage
      When I move to Buy
      And click on Mortgages
      Then Mortgage screen is displayed