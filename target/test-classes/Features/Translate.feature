Feature: Translate the text in S2NBG page

Scenario Outline:  Verifying translated text

Given User is on S2bNG page 
When User navigate S2Bngpage to google translator page
And user enter the text in translate page
Then user get the output translate text
Then user verify the translated text from datasheet "<TestCaseid>" 
Then user close the browser  
  
  Examples:
  |TestCaseid|
  |TC001	 |