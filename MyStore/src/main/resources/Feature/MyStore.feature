@My_Store

Feature: Test Fleet Revenue Reports

	@Scenario_1
  Scenario: Users are able to search for an item using the search bar
  	Given User navigate to the homepage
		When User search any term in the search bar
		Then User validate that the results returned matches the search term
		
  @Scenario_2
  Scenario: Users are able to filter search results under Women category by Color and Category
  	Given User navigate to the homepage
		When User click on Women category
		And User select any value from the color
		And User select category filter item
		Then User validate that the results returned matches the filter criteria
		
  @Scenario_3
  Scenario: Users are able to view the details of any clothing item from the POPULAR section and add
them to the cart
  	Given User navigate to the homepage
		When User select any item from the POPULAR section
		And User add them to the cart
		Then User validate that the item has successfully been added to the cart
		