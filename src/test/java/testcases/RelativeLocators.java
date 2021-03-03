package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sud.v@hotmail.com");
		// driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.linkText("Signin"))).click();
		// driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.xpath("//p[contains(text(),'Already
		// Have')]"))).click();
//		driver.findElement(withTagName("input")
//				.below(By.xpath("(//input[@name='password'][@type='password'])[2]"))).click();
		driver.findElement(RelativeLocator.withTagName("input")
				.below(By.xpath("(//input[@name='password'][@type='password'])[2]"))).click();

		
	}

}
