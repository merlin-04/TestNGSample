package com.obsqura.TestNGSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver driver;

	@BeforeSuite
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91623\\eclipse-workspace\\TestNGSample\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Driver initialized successfully");
	}

	@BeforeTest
	public void launchURL() {
		String URL = "https://www.google.com";
		driver.get(URL);
		System.out.println("Google URL loading..");
	}

	@BeforeClass
	public void beforeClass() {
		String URL = "https://www.fednetbank.com/";
		driver.get(URL);
		System.out.println("Bank URL loading..");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Login to bank application");
	}

	@Test
	public void checkBalance() {
		System.out.println("Check your current account balance");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Logout successfully");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Bank URL launched Successfully");
	}

	@AfterTest
	public void testResult() {
		System.out.println("Google URL launched successfully");
	}

	@AfterSuite
	public void driverClose() {
		System.out.println("Driver closed successfully");
		driver.quit();
	}
}
