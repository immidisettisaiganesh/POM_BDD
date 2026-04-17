Feature: To Test the customer login for ParaBank
	@smoke
 	Scenario Outline: Login using valid details
 		Given user is navigating to Login Page
    	When user is entered "<UserName>" and "<password>"
    	And click on login button
    	Then display account Overview page
    	And logout the application
    	And close the application
@smoke
Examples:
| UserName | password |
|sai333 | sai123 |
|saigani| sai123 |
	
