package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://google.com");
		
		//search for 'abc'
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abc");
		
		//click enter to search for results
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		//wait 3sec on website
		try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		//close driver
		driver.close();
		
		System.out.println("Test completed succesfuly");
	}

}
