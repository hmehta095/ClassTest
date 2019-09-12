import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","/Users/himanshumehta/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://blazedemo.com/");
//		WebElement popScreen = driver.findElement(By.cssSelector("a.exit"));
//		popScreen.click();
		WebElement SubscribeText = driver.findElement(By.name("fromPort"));
		String SubscribeTextData = SubscribeText.getText();

		System.out.println(SubscribeTextData);
		assertEquals("Paris\n  Philadelphia\n  Boston\n  Portland\n  San Diego\n  Mexico City\n  São Paolo", SubscribeTextData);

	}

}
