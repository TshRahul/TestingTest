package com.AmazonExperiments;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Amazon.feature" }, glue = { "com.AmazonExperiments" }, plugin = {
		"pretty", "html:target/amazon-html-report", "json:target/cucumber-reports/JsonFWTest.json",
		"junit:target/cucumber-reports/XmlFWTest.xml" })

public class Runner {

}
