Feature: BackgroundColorSet

Scenario: SkyBlue Background Change
		Given SetSkyBlueBackground button exists
		When I click on the SetSkyBlueBackground button
		Then the background color will change to sky blue

Scenario: White Background Change
		Given SetWhiteBackground button exists
		When I click on the SetWhiteBackground button
		Then the background color will change to white