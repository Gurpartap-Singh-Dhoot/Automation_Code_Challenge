package stepDefinitions;

import pageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyStepDefinitions   {
	
	public String ReferenceNumber;
	myPersonalInformation pi = new myPersonalInformation();
	Login lg = new Login();
	orderTShirt order = new orderTShirt();
	orderHistory order_history = new orderHistory();
	
	@Given("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
		try {
			Hooks.driver.get("http://automationpractice.com");
		}
		catch(Exception e) {}
        
    }

    @Given("^User is on My Account Page$")
    public void user_is_on_my_account_page() throws Throwable {
    	try {
	    	String ExpectedTitle = "My account - My Store";
	    	String ActualTitle =  Hooks.driver.getTitle();
	    	Assert.assertEquals(ActualTitle, ExpectedTitle);
    	}
    	catch(Exception e) {}
    }

    @Given("^User Click on My Personal Information$")
    public void user_click_on_my_personal_information() throws Throwable {
    	try {
    		pi.getPersonalInfo().click();
    	}
    	catch(Exception e) {}
        
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
    	try {
    		lg.getEmail().sendKeys(strArg1);
    		lg.getPassword().sendKeys(strArg2);
    		lg.getLogin().click();
    		
    	}
    	catch(Exception e) {}
    	
        
    }

    @When("^User click on TSHIRTS$")
    public void user_click_on_tshirts() throws Throwable {
    	try {
    		
    		order.getTShirt().click();
    	}
    	catch(Exception e) {}
    	
    }

    @When("^User enters (.+) and (.+) and submit the form$")
    public void user_enters_and_and_submit_the_form(String firstname, String password) throws Throwable {
    	try {
    		pi.getFirstName().clear();
    		pi.getFirstName().sendKeys(firstname);
    		pi.getPasswd().sendKeys(password);
    		pi.getSave().click();
    		
    	}
    	catch(Exception e) {}
    }

    @Then("^User is logged in$")
    public void user_is_logged_in() throws Throwable {
    	try {
	    	String ExpectedTitle = "My account - My Store";
	    	String ActualTitle =  Hooks.driver.getTitle();
	    	Assert.assertEquals(ActualTitle, ExpectedTitle);
    	}
    	catch(Exception e) {}
    }

    @Then("^User validate the order$")
    public void user_validate_the_order() throws Throwable {
    	try {
    		String ActualRefNumber = order_history.getOrderHistory().getText();
    		Assert.assertEquals(ActualRefNumber,ReferenceNumber);
    	}
    	
    	catch(Exception e) {}
        
    }

    @Then("^Verify (.+) gets displayed$")
    public void verify_gets_displayed(String message) throws Throwable {
    	WebElement ValidationMessage;
    	try {
    		ValidationMessage = pi.getSuccess();
    	    }
    	catch(Exception e){
    		ValidationMessage = pi.getFailure();
    	}
    	String ActualMessage = ValidationMessage.getText();
    	Assert.assertEquals(ActualMessage, message);
        
    }

    @And("^Click on Sign In link on Home Page$")
    public void click_on_sign_in_link_on_home_page() throws Throwable {
    	try {
    		lg.getSignIn().click();
    	}
    	catch(Exception e) {}
        
    }


    @And("^Add the Tshirt to the cart$")
    public void add_the_tshirt_to_the_cart() throws Throwable {
    	try {
    		WebElement Avail_Items = order.getAvailableItems();
    		WebElement AddCart = order.getAddCart();
	        Actions action = new Actions(Hooks.driver);
	        action.moveToElement(Avail_Items).click(AddCart).build().perform();
    	}
    	catch(Exception e) {}
	    Thread.sleep(2000);
    }

    @And("^User click on Proceed to checkout on cart details page and navigates to Summary page$")
    public void user_click_on_proceed_to_checkout_on_cart_details_page_and_navigates_to_summary_page() throws Throwable {
    	try {
    		
    		order.getCartCheckOut().click();
    	}
    	catch(Exception e) {}
    }

    @And("^User click on Proceed to checkout on Summary page and navigates to Address page$")
    public void user_click_on_proceed_to_checkout_on_summary_page_and_navigates_to_address_page() throws Throwable {
    	try {
    		order.getCheckOut().click();
    	}
    	catch(Exception e) {}
    }

    @And("^User click on Proceed to checkout on Address page and navigates to Shipping page$")
    public void user_click_on_proceed_to_checkout_on_address_page_and_navigates_to_shipping_page() throws Throwable {
    	try {
    		order.getCheckOut().click();
    	}
    	catch(Exception e) {}
    }

    @And("^Check the Terms of Service$")
    public void check_the_terms_of_service() throws Throwable {
    	try {
    		order.getTerms().click();
    		}
    	catch(Exception e) {}
    	}

    @And("^User click on Proceed to checkout on Shipping page and navigates to Payment page$")
    public void user_click_on_proceed_to_checkout_on_shipping_page_and_navigates_to_payment_page() throws Throwable {
    	try {
    		order.getShipCheckOut().click();
    		}
    	catch(Exception e) {}
    }

    @And("^Select Payment method as (.+) method and click on I confirm my order on Payment page$")
    public void select_payment_method_as_method_and_click_on_i_confirm_my_order_on_payment_page(String payment) throws Throwable {
	    	 String OrderInfo;
	    	 Matcher match;
	    	 Pattern pattern = Pattern.compile("order reference"+"\\W+(\\w+)");
    		 try {
	    	    Hooks.driver.findElement(By.xpath("//a[@title = '" + payment + "']")).click();
	    	    order.getConfirmOrder().click();
	    		if(payment.equals("Pay by check.") ) {
	    			OrderInfo = order.getByCheckOrder().getText();
	    		    match = pattern.matcher(OrderInfo);       
	    		    ReferenceNumber = match.find()? match.group(1):null; 
	    		}
	    		else if(payment.equals("Pay by bank wire")) {
	    	        OrderInfo = order.getBankByWire().getText();
	    		    match = pattern.matcher(OrderInfo);       
	    		    ReferenceNumber = match.find()? match.group(1):null;   
	    		}
	    		else {
	    			//Do nothing
	    		}
    		}
    		catch(Exception e) {
    		}	
    }

    @And("^User click on back to orders$")
    public void user_click_on_back_to_orders() throws Throwable {
    	order.getBackOrders().click();
    }

    @And("^User signed out$")
    public void user_signed_out() throws Throwable {
    	lg.getSignOut().click();
    }

    }