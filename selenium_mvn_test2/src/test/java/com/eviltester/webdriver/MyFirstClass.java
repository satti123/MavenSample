package com.eviltester.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstClass {

	@Test
	public void startWebDriver() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		String x = driver.getCurrentUrl();
		System.out.println(x);
		driver.close();
		driver.quit();
	}

}
