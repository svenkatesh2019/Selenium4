package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndPopupsUsingSele4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		System.out.println("First window: "+ driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://gmail.com");
		System.out.println("Second window: "+ driver.getTitle());
		driver.findElement(By.linkText("Sign in")).click();
		Set<String> wins=driver.getWindowHandles();
		Iterator<String> iter=wins.iterator();
		iter.next();
		iter.next();
		String third_win=iter.next();
		driver.switchTo().window(third_win);
		System.out.println("third window: "+ driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://facebook.com");
		System.out.println("fourth window: "+ driver.getTitle());
//		driver.close();
//		driver.switchTo().window(third_win);
//		driver.close();
		driver.quit();
	}

}
