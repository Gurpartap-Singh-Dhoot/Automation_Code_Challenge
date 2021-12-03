package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinitions.Hooks;

public class orderTShirt {


	By tshirt=By.xpath("(//a[@title = 'T-shirts'])[2]");
	By available_items = By.xpath("//span[@class= 'available-now']");
    By addCart = By.xpath("//a[@title= 'Add to cart']");
    By checkOut = By.xpath("//span[text()='Proceed to checkout']");
    By cartCheckOut = By.xpath("//a[@title='Proceed to checkout']");
    By shipCheckOut  = By.xpath("//button[@name='processCarrier']");
    By terms = By.xpath("//label[text()='I agree to the terms of service and will adhere to them unconditionally.']");
    By confirmOrder = By.xpath("//span[text()='I confirm my order']");
    By backToOrders = By.xpath("//a[@title= 'Back to orders']");
    By checkOrder = By.xpath("//div[@class = 'box order-confirmation']");
    By bankwireOrder = By.xpath("//div/div/div/div[@class = 'box']");

	public WebElement getTShirt()
	{
		return Hooks.driver.findElement(tshirt);
	}
	public WebElement getAvailableItems()
	{
		return Hooks.driver.findElement(available_items);
	}
	public WebElement getAddCart()
	{
		return Hooks.driver.findElement(addCart);
	}
	public WebElement getCheckOut()
	{
		return Hooks.driver.findElement(checkOut);
	}
	public WebElement getTerms()
	{
		return Hooks.driver.findElement(terms);
	}
	public WebElement getConfirmOrder()
	{
		return Hooks.driver.findElement(confirmOrder);
	}
	public WebElement getBackOrders()
	{
		return Hooks.driver.findElement(backToOrders);
	}
	public WebElement getCartCheckOut()
	{
		return Hooks.driver.findElement(cartCheckOut);
	}
	public WebElement getShipCheckOut()
	{
		return Hooks.driver.findElement(shipCheckOut);
	}
	public WebElement getBankByWire()
	{
		return Hooks.driver.findElement(bankwireOrder);
	}
	public WebElement getByCheckOrder()
	{
		return Hooks.driver.findElement(checkOrder);
	}
	
}
