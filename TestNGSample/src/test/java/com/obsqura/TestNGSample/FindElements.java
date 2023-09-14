package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FindElements extends Base {
	@Test
	public void sideMenuFindElements() {
		String input = "Checkbox Demo";
		List<WebElement> menu = driver.findElements(By.xpath("//ul[contains(@class,'list-group')]//a"));
		for (WebElement menuText : menu) {
			String actualOutput = menuText.getText();
			if (input.equals(actualOutput)) {
				menuText.click();
				break;
			}
		}
	}
}
