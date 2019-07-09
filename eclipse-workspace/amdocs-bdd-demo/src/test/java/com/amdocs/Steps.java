package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{
	private com.amdocs.Math math;
	private double firstInput,secondInput,actualResult,expectedResult; 
	@Given("the first input is {string}")
	public void the_first_input_is(String strFirstInput) 
	{
	   this.firstInput=Double.parseDouble(strFirstInput);
	}
	@Given("the second input is {string}")
	public void the_second_input_is(String strSecondInput) 
	{
		 this.secondInput=Double.parseDouble(strSecondInput);
	}

	@When("I invoke the add method")
	public void i_invoke_the_add_method() 
	{
	    math=new com.amdocs.Math();
	    this.actualResult=math.add(this.firstInput,this.secondInput);
	}
	@Then("I expect the result as {string}")
	public void i_expect_the_result_as(String strExpectedResult)
	{
	   this.expectedResult=Double.parseDouble(strExpectedResult);
	   assertEquals(this.expectedResult,this.actualResult,0.0001);
	}
}
