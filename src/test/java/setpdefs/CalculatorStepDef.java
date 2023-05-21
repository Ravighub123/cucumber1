package setpdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

public class CalculatorStepDef {
	int num1;
	int num2;
	int result=0;
	List<Integer> values;
	
	Map<String, Integer> prices;
	int totalBill=0;

	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(int var1, int var2) {
	    // Write code here that turns the phrase above into concrete actions
		this.num1=var1;
		this.num2=var2;
	
	}

	@When("I add those two numbers")
	public void i_add_those_two_numbers() {
	    // Write code here that turns the phrase above into concrete actions
		result= num1+num2;
	    
	}

	@Then("I should get the result as {int}")
	public void i_should_get_the_result_as(int expresult) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(expresult,result);
	   
	}

	@When("I sub those two numbers")
	public void i_sub_those_two_numbers() {
	    // Write code here that turns the phrase above into concrete actions
		result= num1-num2;
	
	}
	
	@Given("I have below numbers")
	public void i_have_below_numbers(List<Integer> numbers) {
	   
		this.values = numbers;
	}

	@When("I add those numbers")
	public void i_add_those_numbers() {
		
		for(int num:values) {
			
			result = result+num;
			
		}
	   
	}
	
	@Given("I want to buy below items")
	public void i_want_to_buy_below_items(Map<String, Integer> priceList) {
		
		this.prices = priceList;
	    
	}

	@When("I purchase them")
	public void i_purchase_them() {
		
for(String key: prices.keySet() ) {
			
			totalBill = totalBill + prices.get(key);
}
	
	}

	@Then("I should get the bill amount as {int}")
	public void i_should_get_the_bill_amount_as(int expResult) {
		
		Assert.assertEquals(expResult, totalBill);
	}
		@Given("I want to buy below items in given quntity")
		public void i_want_to_buy_below_items_in_given_quntity(io.cucumber.datatable.DataTable dataTable) {
			
			int rows= dataTable.height();
			for(int i=0;i<rows;i++)
			{
				
				String item = dataTable.cell(i, 0);
				int qnt = Integer.parseInt(dataTable.cell(i, 1));
				int val = Integer.parseInt(dataTable.cell(i, 2));
				
				totalBill = totalBill + (qnt*val);
			}
		   
		}
	


}
