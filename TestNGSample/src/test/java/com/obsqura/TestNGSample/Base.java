package com.obsqura.TestNGSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	WebDriver driver;

	@BeforeMethod
	public void intializeBrowser() {
//		driver = WebDriverManager.chromedriver().create();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91623\\git\\TestNGSample\\TestNGSample\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void driverCloseOrQuit() {
		// driver.close();
		driver.quit();
	}
}
