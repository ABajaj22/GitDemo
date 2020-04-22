package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefinition {

	
	@Given("^User needs to be on landing page$")
	public void user_needs_to_be_on_landing_page() {
		
	System.out.println("User needs to be on landing page 1");
	
	}
	
	@When("^User enters username and password$")
	public void User_enters_username_and_password() {
		System.out.println("User enters username and password1");		
		
	}
	@And("^clicks on Enter$")
	public void clicks_on_Enter() {
		System.out.println("clicks on Enter 1");	
		
	}
	@Then("^home page should get loaded$")
	public void home_page_should_get_loaded() {
		
		System.out.println("home page should get loaded 1");	
	}
	@And("^Cards are displayed$")
	public void Cards_are_displayed() {
		System.out.println("Cards are displayed 1	");	
		
		
	}
	
	
	
	
	
	
	
	
	
}
