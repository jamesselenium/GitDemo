*** Settings ***
library         SeleniumLibrary





*** Keywords ***

Open webbrowser
     Create Webdriver    Chrome     
    GO To   https://www.rahulshettyacademy.com/loginpagePractise/

Login to the page 
     [Arguments]     ${Login}        ${Password}   ${butonlocator}

  Input Text        //input[@id="username"]    ${Login} 
  Input Password    //input[@id="password"]    ${Password}    
  Click Element     //input[@value="user"]/following-sibling::span 
  Sleep    5s
  Execute JavaScript    document.getElementById("okayBtn").click()
  Click Element      //input[@id="terms"]  modifier=False
  Click Element      //input[@id="signInBtn"]  modifier=False

verify page 
    [Arguments]         ${Page_Locator}
    Wait Until Element Is Visible   ${Page_Locator}  

click element using javascript 
    [Arguments]         ${locator}
    Execute JavaScript  document.evaluate("${locator}", document, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null).snapshotItem(0).click();
