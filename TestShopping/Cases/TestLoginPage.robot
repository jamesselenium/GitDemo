*** Settings ***

Resource    ../Keywords/Shared_Keywords.robot




*** Test Cases ***

Test login page
    Open webbrowser
    Login to the page    rahulshettyacademy     learning     //button[@id="okayBtn"]
    verify page   //h1[@class="my-4"]