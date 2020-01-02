$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/checking.feature");
formatter.feature({
  "name": "Adactin details validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validating the invalid login credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on adaction home page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the \"\u003cusername\u003e\", \"\u003cpassword\u003e\" and click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "user is on home page select\"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomtype\u003e\",\"\u003cno of rooms\u003e\",\"\u003ccheck in\u003e\",\"\u003ccheck out\u003e\",\"\u003cno adult\u003e\",\"\u003cno children\u003e\" hit the search button",
  "keyword": "And "
});
formatter.step({
  "name": "select the hotel and click the continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003caddress\u003e\",\"\u003ccredit card no\u003e\",\"\u003ccredit card type\u003e\",\"\u003cexpired date\u003e\",\"\u003cexpired year\u003e\",\"\u003ccvv no\u003e\" click the book now button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the url.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "roomtype",
        "no of rooms",
        "check in",
        "check out",
        "no adult",
        "no children",
        "firstname",
        "lastname",
        "address",
        "credit card no",
        "credit card type",
        "expired date",
        "expired year",
        "cvv no"
      ]
    },
    {
      "cells": [
        "Revanth10",
        "revanthg",
        "Brisbane",
        "Hotel Sunshine",
        "Deluxe",
        "2 - Two",
        "24/12/2019",
        "25/12/2019",
        "1 - One",
        "2 - Two",
        "Revanth",
        "ganesan",
        "perumalkovil",
        "5432123456779865",
        "VISA",
        "July",
        "2022",
        "008"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validating the invalid login credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on adaction home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_adaction_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"Revanth10\", \"revanthg\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_and_click_the_login_button(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d79.0.3945.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027HARIHARESH\u0027, ip: \u0027192.168.43.53\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.88, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: C:\\Users\\HARIHA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61455}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: ff9749dd89f1bccd20122cbf05b1f634\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsById(RemoteWebDriver.java:376)\r\n\tat org.openqa.selenium.By$ById.findElements(By.java:180)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElements(DefaultElementLocator.java:85)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:36)\r\n\tat com.sun.proxy.$Proxy14.get(Unknown Source)\r\n\tat com.stepdefiniton.StepDefinition.user_enter_the_and_click_the_login_button(StepDefinition.java:23)\r\n\tat ✽.user enter the \"Revanth10\", \"revanthg\" and click the login button(src/test/resources/feature/checking.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is on home page select\"Brisbane\",\"Hotel Sunshine\",\"Deluxe\",\"2 - Two\",\"24/12/2019\",\"25/12/2019\",\"1 - One\",\"2 - Two\" hit the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_is_on_home_page_select_hit_the_search_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select the hotel and click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_the_hotel_and_click_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the \"Revanth\",\"ganesan\",\"perumalkovil\",\"5432123456779865\",\"VISA\",\"July\",\"2022\",\"008\" click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_click_the_book_now_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the url.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_the_url()"
});
formatter.result({
  "status": "skipped"
});
});