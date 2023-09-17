package com.obsqura.TestNGSample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Popup extends Base {
	@Test
	public void windowPopup() {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebElement likeUsOnFacebookButton = driver
				.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		likeUsOnFacebookButton.click();
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				WebElement loginButton = driver.findElement(By.xpath(
						"//form[@id='login_popup_cta_form']//following::div[@aria-label='Accessible login button']"));
				loginButton.click();
			}
		}
	}
}
