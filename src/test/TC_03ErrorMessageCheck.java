package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03ErrorMessageCheck {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohan\\eclipse-workspace\\BankProject\\driver\\chromedriver.exe"	);
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		String title="Guru99 Bank Home Page";
		String bankTitle = driver.getTitle();
		driver.findElement(By.name("uid")).sendKeys("ngr413332");
		driver.findElement(By.name("password")).sendKeys("qyzUqy");		
		driver.findElement(By.name("btnLogin")).click();
		Alert a= driver.switchTo().alert();
		a.accept();
		if(title.equals(bankTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed"); 
	}
		driver.quit();
}
}