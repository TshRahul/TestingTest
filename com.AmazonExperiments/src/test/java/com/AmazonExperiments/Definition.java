package com.AmazonExperiments;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definition {
	
	
	@Given("^open chrome and visit amazon$")
	public void open_chrome_and_visit_amazon() throws Throwable {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	    DesiredCapabilities capabilities = new DesiredCapabilities();
			
			// capabilities = DesiredCapabilities.firefox();
			
			 capabilities.setBrowserName("chrome");
			  capabilities.setPlatform(Platform.WINDOWS);
			  capabilities.setCapability("marionette", false);
		          WebDriver driver=new ChromeDriver(capabilities); 
		          driver.get("https://www.amazon.in");
		          driver.manage().window().maximize();
	  
	}

	@When("^we click on login button$")
	public void we_click_on_login_button() throws Throwable {
	
		System.out.println("kjdgfvwndbfheorhf");
	}

	@Then("^it should take us to the new page$")
	public void it_should_take_us_to_the_new_page() throws Throwable {
		
		System.out.println("wldbfhvhebwfkjgwuorf");
	    
	}


}
