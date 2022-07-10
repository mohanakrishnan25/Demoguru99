package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_01LoginPage {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\mohan\\eclipse-workspace\\DemoGuru99\\drivers\\geckodriver.exe"	);
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.demo.guru99.com/V4/");
	driver.manage().window().maximize();
	driver.findElement(By.name("uid")).sendKeys("mngr413332");
	driver.findElement(By.name("password")).sendKeys("uqyzUqy");
	driver.findElement(By.name("btnLogin")).click();
	driver.quit();
}
}
