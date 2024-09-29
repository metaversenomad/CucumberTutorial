package com.cybertek.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getName());
        System.out.println("Empty hook before");
    }
    @Before("@scenario_1")
    public void specialSetup(){
        System.out.println("Special hook before\n");
    }
    @After("@scenario_1")
    public void tearDown(){
        System.out.println("Special hook after\n");
    }
    @After
    public void tearDown() {
        System.out.println("Empty hook after");
    }
}