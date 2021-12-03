package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.Hooks;

public class myPersonalInformation {

	By personal_info=By.xpath("//span[text()='My personal information']");
	By firstname = By.name("firstname");
    By current_passwd = By.name("old_passwd");
    By save = By.xpath("//button[@name = 'submitIdentity']");
    By successMessage = By.xpath("//div/div/div/p[@class = 'alert alert-success']");
    By failureMessage = By.xpath("//div/div/div[@class = 'alert alert-danger']/ol/li");

	public WebElement getPersonalInfo()
	{
		return Hooks.driver.findElement(personal_info);
	}
	public WebElement getFirstName()
	{
		return Hooks.driver.findElement(firstname);
	}
	public WebElement getPasswd()
	{
		return Hooks.driver.findElement(current_passwd);
	}
	public WebElement getSave()
	{
		return Hooks.driver.findElement(save);
	}
	public WebElement getSuccess()
	{
		return Hooks.driver.findElement(successMessage);
	}
	public WebElement getFailure()
	{
		return Hooks.driver.findElement(failureMessage);
	}
}
