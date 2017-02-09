package com.accenture.Ilir_BDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
  plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport"},
  features = {"src/test/features"}
  ) 

public class RunnerClass {

}

//25967
//         TC_002: I want to make a transfer to another bank account whenever I need to
//		   TC_003: I want to make a transfer to an international bank account