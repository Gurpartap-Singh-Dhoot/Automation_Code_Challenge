package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.Hooks;

public class orderHistory {
	By orderHistory=By.xpath("//table[@id=\"order-list\"]/tbody/tr[1]/td[1]/a");

	public WebElement getOrderHistory()
	{
		return Hooks.driver.findElement(orderHistory);
	}
}
