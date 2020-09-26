package TNQ.TNQ_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String URL="https://authorcafe.com/sign-in/";
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SANKET\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement Username=driver.findElement(By.id("username"));
		Username.sendKeys("aucsdet@yopmail.com");
		
		WebElement Password=driver.findElement(By.id("signpassword"));
		Password.sendKeys("Authorcafe@123");
		
		WebElement SignIn=driver.findElement(By.name("signin"));
		SignIn.click();
	
		//driver.findElement(By.xpath("//p[@id='']")).sendKeys("Hello World..!!");;
	
	    driver.findElement(By.id("48249_12997_b28aa878_2")).click();
        driver.switchTo().activeElement().sendKeys("Hello World..!");
	}

}
