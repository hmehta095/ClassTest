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
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazedemo.com/");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}

	@Test
	public void test() throws InterruptedException {

		WebElement DepartCity = driver.findElement(By.name("fromPort"));
		String DepartCityData = DepartCity.getText();

		System.out.println(DepartCityData);
//		assertEquals("7", SubscribeTextData);
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException {
//		
		WebElement FindFlight = driver.findElement(By.className("container"));
		FindFlight.click();

	}
	
	@Test
	public void test3() throws InterruptedException {
		WebElement FName = driver.findElement(By.id("inputName"));
		FName.sendKeys("himanshu");
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("165");
		WebElement City = driver.findElement(By.id("city"));
		City.sendKeys("scarbrough");
		WebElement State = driver.findElement(By.id("state"));
		State.sendKeys("Ontario");
	
	}
	
	

}
