Feature: Validation and Verification of multilingual and galen 

Scenario Outline: Galen and multilingual validation in amazon portal 
	Given user is on amazon homepage with "<TestCaseid>"
	When user choose the Languages in amazon  
	And user verifies the translated text with "<TestCaseid>" 
	Then validation of homepage layout using galen 
	When user clicks on Account and List button 
	When user enters "<email>" inside email inputbox 
	Then validation of signup1 layout using galen 
	Then user clicks on continue button 
	When user enters "<password>" inside password inputbox 
	Then validation of signuptwo layout using galen 
	Then user clicks on signin button 
	And user enters iphone in searchbox 
	And user clicks on search button 
	Then validation of firstproductsearch layout using galen 
	And user clicks on first mobile icon 
	Then validation of firstproductdescriptionpage layout using galen 
	And user clicks on Addtolist button 
	And user clicks on continue shopping button 
	And user clicks on second product icon 
	Then validation of secondproductdescriptionpage layout using galen 
	And user clicks on Addtolist button 
	And user clicks on continue shopping button 
	And user mousehover on Accounts and Lists Icon 
	And user clicks on Shopping list 
	And user verifies image1 
	And user verifies image2 
	And user closes the browser 
	
	Examples: 
		| TestCaseid |
		| TC002      |
		