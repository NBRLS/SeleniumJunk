package basics.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCommands {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		//to ignore chrome info notifications -like chrome is controlled by automation machine
		
		options.addArguments("disable-infobars");

		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.getPageSource();
		
		driver.quit();//or driver.close()
		
	}

}
