Feature: Adactin details validation

  Scenario Outline: validating the invalid login credentials
    Given user is on adaction home page
    When user enter the "<username>", "<password>" and click the login button
    And user is on home page select"<location>","<hotels>","<roomtype>","<no of rooms>","<check in>","<check out>","<no adult>","<no children>" hit the search button
    And select the hotel and click the continue button
    And user enter the "<firstname>","<lastname>","<address>","<credit card no>","<credit card type>","<expired date>","<expired year>","<cvv no>" click the book now button
    Then verify the url.

    Examples: 
      | username  | password | location  | hotels         | roomtype | no of rooms | check in   | check out  | no adult | no children | firstname | lastname  | address      | credit card no   | credit card type | expired date | expired year | cvv no |
      | Revanth10 | revanthg | Brisbane  | Hotel Sunshine | Deluxe   | 2 - Two     | 24/12/2019 | 25/12/2019 | 1 - One  | 2 - Two     | Revanth   | ganesan   | perumalkovil | 5432123456779865 | VISA             | July         |         2022 |    008 |
 