package com.accenture.Ilir_BDD;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AC001_SampleBanking_StepDefinition {


@Given("^a user access the bank web app$")
public void a_user_access_the_bank_web_app() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}

@Given("^logs using the credentials$")
public void logs_using_the_credentials(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)

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
