package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_02TitleCheck {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\mohan\\eclipse-workspace\\DemoGuru99\\drivers\\geckodriver.exe"	);
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.demo.guru99.com/V4/");
	driver.manage().window().maximize();
	String title="Guru99 Bank Home Page";
	String bankTitle = driver.getTitle();
	driver.findElement(By.name("uid")).sendKeys("mngr413332");
	driver.findElement(By.name("password")).sendKeys("uqyzUqy");		
	driver.findElement(By.name("btnLogin")).click();
	if(title.equals(bankTitle)) {
		System.out.println("Test Passed");
	}else {
		System.out.println("Test Failed"); 
}
	driver.quit();

}

}


