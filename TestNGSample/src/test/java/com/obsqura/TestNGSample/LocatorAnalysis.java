package com.obsqura.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorAnalysis extends Base {
	@Test
	public void verifyClassNameOfShowMessageButton() {
		WebElement showMessageButtonClass = driver
				.findElement(By.xpath("//button[contains(@class,'primary') and @id='button-one']"));
	}

	@Test
	public void verifyIdOfShowMessageButton() {
		WebElement showMessageButtonId = driver.findElement(By.id("button-one"));
	}

	@Test
	public void verifyShowMessageButtonUsingCssSelector() {
		WebElement showMessageButtonCssSelector = driver.findElement(By.cssSelector("button[id='button-one']"));
	}

	@Test
	public void verifyShowMessageButtonUsingXpath() {
		WebElement showMessageButtonXpath = driver.findElement(By.xpath("//button[@id='button-one']"));
	}
}
