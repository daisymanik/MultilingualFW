Feature: verifying S2BNG login Page Details 

Scenario Outline: Verifying login Page Details with valid Credentials 

	Given user is on LoginPage "<TestCaseid>" 
	When layout validation is performed on loginpage
	When user choose the Languages 
	When User enter username and groupid 
	And user click the continue button 
	And user enter the password 
	And user clcik the login button 
	Then layout validation is performed on home page
	Then user verify the error message and write in Datasheet 
	
	Examples: 
		| TestCaseid |
		| TC001      |
		
		