package testpr;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceform {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-server-3.9.1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html ");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.findElement(By.name("firstname")).sendKeys("Anjali");
		driver.findElement(By.name("lastname")).sendKeys("elango");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-6")).click();
		driver.findElement(By.id("datepicker")).sendKeys("07-08-2022");
		driver.findElement(By.id("profession-1")).click();
		
		//js.executeScript("windows.scrollTo(0,1000)");
		driver.findElement(By.id("tool-2")).click();
		driver.findElement(By.id("tool-1")).click();
		driver.findElement(By.id("continents")).click();
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"continents\"]/option[6]"));
		dropdown.click();
		
		driver.findElement(By.id("selenium_commands"));
		WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[5]"));
		dropdown2.click();
		
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\keert\\OneDrive\\Pictures\\Saved Pictures\\nature.jpg");

		System.out.println("before submit");
		
		driver.findElement(By.id("submit")).click();
		System.out.println("submitted");
	}

}
