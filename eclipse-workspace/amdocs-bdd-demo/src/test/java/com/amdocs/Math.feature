Feature: Develop a Math application that supports addition, subtraction, multiplication and 		 Division operations.

Scenario Outline: As an end-user I should be able to perform simple addition of two numbers.
	Given the first input is <firstINput>
	And the second input is <secondInput>
	When I invoke the add method
	Then I expect the result as <expectedResult>	
		Examples:
		| firstInput		| secondInput  | expectedResult |
		| "10.0"	      | "20.0"       | "30.0"         |
		| "15.5"	      | "25.7"       | "41.2"         |
		| "25.0"	      | "75.0"       | "100.0"        |
