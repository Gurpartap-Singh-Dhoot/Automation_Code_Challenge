package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class Login {
	
	By email=By.name("email");
	By password=By.name("passwd");
	By login=By.id("SubmitLogin");
	By signOut = By.linkText("Sign out");
	By signIn = By.linkText("Sign in");

	public WebElement getEmail()
	{
		return Hooks.driver.findElement(email);
	}

	public WebElement getPassword()
	{
		return Hooks.driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return Hooks.driver.findElement(login);
	}
	
	public WebElement getSignOut()
	{
		return Hooks.driver.findElement(signOut);
	}
	
	public WebElement getSignIn()
	{
		return Hooks.driver.findElement(signIn);
	}
	
}
