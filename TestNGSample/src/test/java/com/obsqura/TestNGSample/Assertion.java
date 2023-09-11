package com.obsqura.TestNGSample;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base{
	@Test
	public void assertEquals() {
		String input = "MERLIN";
		String expectedMessage = "Your Message : " + input;
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage = yourMessageText.getText();
		Assert.assertEquals(expectedMessage,actualMessage,"Your Message text is not "+expectedMessage);
	}
	@Test
	public void assertTrue() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckboxButton = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckboxButton.click();
		boolean isSelectedCheckboxButton = singleCheckboxButton.isSelected();
		Assert.assertTrue(isSelectedCheckboxButton, "Male Radio Button is not selected");
	}
	@Test
	public void assertFalse() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		boolean isEnabledSelectAllButton = selectAllButton.isEnabled();
		Assert.assertFalse(isEnabledSelectAllButton, "Radio Button is Enabled");
	}
	@Test
	public void assertNotEqualSample() {
		String a= "Hello";
		String b = "World";
		assertNotEquals(a, b, "A and B are same");
	}
	@Test
	public void assertNullSample() {
		String s = null;
		assertNull(s, "S is not Null");
	}
	@Test
	public void assertNotNullSample() {
		String b ="India";
		assertNotNull(b,"B is Null");
	}
	@Test
	public void hardAssert() {
		String expectedMessage = "Show Message";
		String expectedFontWeight ="400"; 
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualMessage = showMessageButton.getText();
		String showMessageButtonFontWeight = showMessageButton.getCssValue("font-weight");
		Assert.assertEquals(expectedMessage,actualMessage,"Show Button text is not "+ expectedMessage);
		Assert.assertEquals(expectedFontWeight,showMessageButtonFontWeight,"Show Message Button Weight is not "+expectedFontWeight );
		
	}
	@Test
	public void verifyShowMessageButtonText() {
		String expectedMessage = "Show Messages";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualMessage = showMessageButton.getText();
		Assert.assertNotEquals(expectedMessage,actualMessage,expectedMessage+"and"+actualMessage+"are same");
	}
}
