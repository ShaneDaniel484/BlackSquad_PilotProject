Feature: user is in cruise page in thomascook page
	Scenario: user used to search cruise
		Given user is in the Thomascook page
		When user clicks the cruise button
		When Again user clicks Africa button shows in drop down.
		And user selects the value from dropdown 
		And user selects the value from dropdown
		And user selects the value from dropdown
		And user clicks on the search button
		
		Then Finally user clicks on modify button