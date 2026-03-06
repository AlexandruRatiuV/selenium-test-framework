Java Selenium Test Automation Framework

Tech stack:
- Java
- Selenium WebDriver
- jUnit
- Maven

Design patterns implemented:
- Page Object Model (POM)
- Driver Factory Pattern
- Utility abstraction for waits and actions

Framework structure:
driver
 - DriverManager
 - ChromeDriverManager
 - DriverManagerFactory

pages
 - YoutubeHomePage
 - YoutubeLoginPage
 - YoutubeResultPage

utils
 - WaitUtils
 - SeleniumUtils

tests
 - YoutubeSearchTest

Features:
- Reusable WebDriver initialization
- Centralized wait handling
- Page Object abstraction
