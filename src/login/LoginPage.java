package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		//launch Firefox
		driver= new FirefoxDriver();

		//Launch Smartsync site
		driver.get("https://smartsync.entrata.com/?module=authentication&action=view_login");
		//Click on Login button
	/*	driver.findElement(By.xpath(".//*[@id='Login']")).click();
		//get error message
		String str=driver.findElement(By.xpath(".//*[@id='ajax_message']/p")).getText();
		System.out.println(str);
		//Get title of page 
		String title=driver.getTitle();
		System.out.println(title);*/
		
		//find element username and password and enter wrong information and click on login and print validation message
		driver.findElement(By.xpath(".//*[@id='user[username]']")).sendKeys("1233 ");
		driver.findElement(By.xpath(".//*[@id='user[password]']")).sendKeys("3243 ");
		driver.findElement(By.xpath(".//*[@id='Login']")).click();
		String str=driver.findElement(By.xpath(".//*[@id='ajax_message']/p")).getText();
		System.out.println(str);
		
		//Enter correct information and click on login
		
		driver.findElement(By.xpath(".//*[@id='user[username]']")).sendKeys("prasads");
		driver.findElement(By.xpath(".//*[@id='user[password]']")).sendKeys("prasads");
		driver.findElement(By.xpath(".//*[@id='Login']")).click();

	}

}
