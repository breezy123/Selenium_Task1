
This project is similar to the Selenium project, however here Selenium Web driver and the test Action classes are removed. I added “APIUtility” class, this class takes parameters “URL Request and “Request Type” executes and returns the actual JSON text and response status code. If the expected status code “200” is not returned the test fails.

Please follow the steps below:

1.	Open the bit-bucket link
2.	Clone the repository to your machine (C:\) drive
3.	Download and install IntelliJ IDE Community 2019 https://www.jetbrains.com/idea/download/other.html
4.	Install IntelliJ IDE
5.	Open the cloned project via IntelliJ IDE
6.	Let IDE auto download dependencies 
7.	Navigate to package “test”-> “java”->” DogbreedAPI_test”.
8.	There’re four classes named “ListAllDogsTestSuite.java” is one of the classes 
9.	Right click on either and select “ListAllDogsTestSuite.java”, this will therefor execute the test.
10.	When you have executed the tests, open the project on C:\ driver
11.	Open the “Report” folder, continue open the sub-folders until you reach “extentReport.html” file, and open this .html file.
12.	Test report presented.
