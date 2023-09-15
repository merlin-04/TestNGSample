package com.obsqura.TestNGSample;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTables extends Base {
	@Test
	public void verifyTheadOfTheTable() {
		List<String> expectedHead = Arrays.asList("Name","Position","Office","Age","Start date","Salary");
		System.out.println(expectedHead);
		String expectedTableHead = String.join(" ", expectedHead);
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> actualTableHead = driver
				.findElements(By.xpath("//table[@id='dtBasicExample']//following-sibling::thead"));
		for (WebElement thead : actualTableHead) {
			String actualTheadText = thead.getText();
			Assert.assertEquals(expectedTableHead, actualTheadText, "Actual value and expected value are not same");
		}
	}

	@Test
	public void verifyNameInTheTable() {
		String expectedValue = "Ashton Cox";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		System.out.println(expectedValue);
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='dtBasicExample']"));
		for (WebElement tableName : table) {
			String actualValue = tableName.getText();
			boolean actualName = actualValue.contains(expectedValue);
			Assert.assertTrue(actualName, "Expected Name is not same as the Actual Name");
		}
	}
}
