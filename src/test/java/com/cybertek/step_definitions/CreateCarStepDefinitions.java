package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {
//    @Given("user is the landing page")
//    public void user_is_the_landing_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("user logs in with {string} and {string} credentials")
//    public void user_logs_in_with_and_credentials(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("user navigates to {string} and {string}")
//    public void user_navigates_to_and(String string, String string2) {
//        System.out.println("user navigates to %s tab and %s module",string,string2);
//    }

    @Then("user click on create car button")
    public void user_click_on_create_car_button() {
        System.out.println("user click on create car button");
    }

    @Then("user enter vehicle information:")
    public void user_enter_vehicle_information(List<Map<String, String>> dataTable) {
        System.out.println("Driver:" +dataTable.get(0).get("Driver"));
        System.out.println("Location:" +dataTable.get(0).get("Location"));
    }
}