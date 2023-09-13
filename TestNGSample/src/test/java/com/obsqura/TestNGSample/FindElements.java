package com.obsqura.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FindElements extends Base{
	@Test
	public void sideMenuFindElements()
	{
		String input = "Checkbox Demo";
		List <WebElement> menu = driver.findElements(By.xpath("//ul[contains(@class,'list-group')]//a"));
		SoftAssert softassert = new SoftAssert();
		for (WebElement menuText : menu) {
			String actualOutput = menuText.getText();
			softassert.assertEquals(input, actualOutput, "The actual output is not same as the " + input);
			menuText.click();
			break;
		}
//		softassert.assertAll();
	}
}
