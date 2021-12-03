package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void setupClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.manage().window().maximize();
	}
	
	@After

	public void AfterSteps(Scenario scenario) {
		try{
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if(scenario.isFailed()) {
				TakesScreenshot ts=(TakesScreenshot) driver;
				byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot,"image/png",screenshotName );
			}}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		driver.close();
		driver.quit();
	}}
	

