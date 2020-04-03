$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AmazonTesting.feature");
formatter.feature({
  "name": "Validation and Verification of multilingual and galen",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Galen and multilingual validation in amazon portal",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on amazon homepage with \"\u003cTestCaseid\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user choose the Languages in amazon",
  "keyword": "When "
});
formatter.step({
  "name": "user verifies the translated text with \"\u003cTestCaseid\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "validation of homepage layout using galen",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on Account and List button",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \"\u003cemail\u003e\" inside email inputbox",
  "keyword": "When "
});
formatter.step({
  "name": "validation of signup1 layout using galen",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on continue button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters \"\u003cpassword\u003e\" inside password inputbox",
  "keyword": "When "
});
formatter.step({
  "name": "validation of signuptwo layout using galen",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on signin button",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters iphone in searchbox",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "name": "validation of firstproductsearch layout using galen",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on first mobile icon",
  "keyword": "And "
});
formatter.step({
  "name": "validation of firstproductdescriptionpage layout using galen",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on Addtolist button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on continue shopping button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on second product icon",
  "keyword": "And "
});
formatter.step({
  "name": "validation of secondproductdescriptionpage layout using galen",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on Addtolist button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on continue shopping button",
  "keyword": "And "
});
formatter.step({
  "name": "user mousehover on Accounts and Lists Icon",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on Shopping list",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies image1",
  "keyword": "And "
});
formatter.step({
  "name": "user verifies image2",
  "keyword": "And "
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TestCaseid"
      ]
    },
    {
      "cells": [
        "TC002"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Galen and multilingual validation in amazon portal",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on amazon homepage with \"TC002\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonStepdef.user_is_on_amazon_homepage_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the Languages in amazon",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonStepdef.user_choose_the_Languages_in_amazon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies the translated text with \"TC002\"",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_verifies_the_translated_text_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validation of homepage layout using galen",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepdef.validation_of_homepage_layout_using_galen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Account and List button",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_Account_and_List_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"\u003cemail\u003e\" inside email inputbox",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonStepdef.user_enters_inside_email_inputbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validation of signup1 layout using galen",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepdef.validation_of_signup_layout_using_galen(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"\u003cpassword\u003e\" inside password inputbox",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonStepdef.user_enters_inside_password_inputbox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validation of signuptwo layout using galen",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepdef.validation_of_signuptwo_layout_using_galen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters iphone in searchbox",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_enters_iphone_in_searchbox()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027twotabsearchtextbox\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.162)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HCL-PC\u0027, ip: \u0027192.168.1.98\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.162, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\HCL\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:50165}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f839af7e9482d27fae6c3dbddc5f76ab\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027twotabsearchtextbox\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat StepDefinition.AmazonStepdef.user_enters_iphone_in_searchbox(AmazonStepdef.java:375)\r\n\tat ✽.user enters iphone in searchbox(src/test/resources/Features/AmazonTesting.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validation of firstproductsearch layout using galen",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepdef.validation_of_firstproductsearch_layout_using_galen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on first mobile icon",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_first_mobile_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validation of firstproductdescriptionpage layout using galen",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepdef.validation_of_firstproductdescriptionpage_layout_using_galen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Addtolist button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_Addtolist_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on continue shopping button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_continue_shopping_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on second product icon",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_second_product_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validation of secondproductdescriptionpage layout using galen",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepdef.validation_of_secondproductdescriptionpage_layout_using_galen()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Addtolist button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_Addtolist_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on continue shopping button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_continue_shopping_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user mousehover on Accounts and Lists Icon",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_mousehover_on_Accounts_and_Lists_Icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on Shopping list",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_clicks_on_Shopping_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies image1",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_verifies_image(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies image2",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_verifies_image(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonStepdef.user_closes_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Features/S2BNGTesting.feature");
formatter.feature({
  "name": "verifying S2BNG login Page Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying login Page Details with valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on LoginPage \"\u003cTestCaseid\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "layout validation is performed on loginpage",
  "keyword": "When "
});
formatter.step({
  "name": "user choose the Languages",
  "keyword": "When "
});
formatter.step({
  "name": "User enter username and groupid",
  "keyword": "When "
});
formatter.step({
  "name": "user click the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the password",
  "keyword": "And "
});
formatter.step({
  "name": "user clcik the login button",
  "keyword": "And "
});
formatter.step({
  "name": "layout validation is performed on home page",
  "keyword": "Then "
});
formatter.step({
  "name": "user verify the error message and write in Datasheet",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TestCaseid"
      ]
    },
    {
      "cells": [
        "TC001"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying login Page Details with valid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on LoginPage \"TC001\"",
  "keyword": "Given "
});
formatter.match({
  "location": "S2BNGStepDef.user_is_on_LoginPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "layout validation is performed on loginpage",
  "keyword": "When "
});
formatter.match({
  "location": "S2BNGStepDef.layout_validation_is_performed_on_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the Languages",
  "keyword": "When "
});
formatter.match({
  "location": "S2BNGStepDef.user_choose_the_Languages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and groupid",
  "keyword": "When "
});
formatter.match({
  "location": "S2BNGStepDef.user_enter_username_and_groupid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "S2BNGStepDef.user_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the password",
  "keyword": "And "
});
formatter.match({
  "location": "S2BNGStepDef.user_enter_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clcik the login button",
  "keyword": "And "
});
formatter.match({
  "location": "S2BNGStepDef.user_clcik_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "layout validation is performed on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "S2BNGStepDef.layout_validation_is_performed_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the error message and write in Datasheet",
  "keyword": "Then "
});
formatter.match({
  "location": "S2BNGStepDef.user_verify_the_error_message_and_write_in_Datasheet()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/Features/Translate.feature");
formatter.feature({
  "name": "Translate the text in S2NBG page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying translated text",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on S2bNG page",
  "keyword": "Given "
});
formatter.step({
  "name": "User navigate S2Bngpage to google translator page",
  "keyword": "When "
});
formatter.step({
  "name": "user enter the text in translate page",
  "keyword": "And "
});
formatter.step({
  "name": "user get the output translate text",
  "keyword": "Then "
});
formatter.step({
  "name": "user verify the translated text from datasheet \"\u003cTestCaseid\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TestCaseid"
      ]
    },
    {
      "cells": [
        "TC001"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying translated text",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on S2bNG page",
  "keyword": "Given "
});
formatter.match({
  "location": "TranslateStepDef.user_is_on_S_bNG_page(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate S2Bngpage to google translator page",
  "keyword": "When "
});
formatter.match({
  "location": "TranslateStepDef.user_navigate_S_Bngpage_to_google_translator_page(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the text in translate page",
  "keyword": "And "
});
formatter.match({
  "location": "TranslateStepDef.user_enter_the_text_in_translate_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get the output translate text",
  "keyword": "Then "
});
formatter.match({
  "location": "TranslateStepDef.user_get_the_output_translate_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify the translated text from datasheet \"TC001\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TranslateStepDef.user_verify_the_translated_text_from_datasheet(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TranslateStepDef.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});