package com.accenture.Ilir_BDD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AC001_SampleBanking_StepDefinition {

WebDriver driver;
	
@Given("^a user access the bank web app$")
public void a_user_access_the_bank_web_app() throws Throwable {
    // Write code here that turns the phrase above into concrete actions


	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.mykidsbank.org");

}

@Given("^logs using the credentials$")
public void logs_using_the_credentials(DataTable table) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)

	 List<List<String>> data =table.raw();
	 
	 WebElement vBankid = driver.findElement(By.name("bank_id"));
	 vBankid.sendKeys(data.get(1).get(0));
	 
	 WebElement vUsername = driver.findElement(By.name("username"));
	 vUsername.sendKeys(data.get(1).get(1));
	 
	 WebElement vPassword = driver.findElement(By.name("password"));
	 vPassword.sendKeys(data.get(1).get(2));
	 	 
	 WebElement vLogin = driver.findElement(By.id("clicked_when_enter_id"));
	 vLogin.click();
	 
	// WebElement vDepositLink;

	// vDepositLink = 
//	driver.findElement(By.name("is_deposit")).click();
//	 vDepositLink.click();
//	 driver.findElement(By.xpath("//a[@onclick='document.new_group_transaction_form.submit()']")).click();


}

@Given("^my checking account has balance equal or greater than zero$")
public void my_checking_account_has_balance_equal_or_greater_than_zero() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
}

@When("^I deposit (\\d+) to my checking account$")
public void i_deposit_to_my_checking_account(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	
	
}

@Then("^I should have additional (\\d+) as balance$")
public void i_should_have_additional_as_balance(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}

@Given("^my checking account has a balance greater than (\\d+) before withdraw$")
public void my_checking_account_has_a_balance_greater_than_before_withdraw(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}

@When("^I withdraw (\\d+) from my checking account$")
public void i_withdraw_from_my_checking_account(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}

@Then("^I should have less (\\d+) as balance$")
public void i_should_have_less_as_balance(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}	
	
}
