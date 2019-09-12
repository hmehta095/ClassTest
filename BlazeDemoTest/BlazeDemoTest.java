import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
//		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://blazedemo.com/");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazedemo.com/");

		WebElement DepartCity = driver.findElement(By.name("fromPort"));
		String DepartCityData = DepartCity.getText();

		System.out.println(DepartCityData);
//		assertEquals("7", SubscribeTextData);
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazedemo.com/");
		WebElement Flight = driver.findElement(By.name("VA12"));
		String FlightData = Flight.getText();
		System.out.println(FlightData);
		Thread.sleep(1000);
		driver.close();
	}

}
