# AutomationFrameworkWithCucumberJvm
This is Ready to use Automation Framework with Cucumber-JVM



# Structure of the Automation Framework 

Package – pageobjects – contains classes for all page objects on a page, use different classes for different pages.

Package – steps  - contains all classes for cucumber steps, use different classes and combine the steps by functionality.

Package – tools – here are all classes that contains the core functionality. 

DebugTestRunner – this class runs only one specific scenario , this is used for debug and develop new scenarios.

RunTestInParallel – runs all test scenarios in parallel , but first generate Junit Classes for every cucumber scenario.

Features directory contains all cucumber feature files. You can put them in different directories and etc. 
