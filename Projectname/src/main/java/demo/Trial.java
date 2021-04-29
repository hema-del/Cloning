package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trial{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\karth\\node_modules\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.omayo.blogspot.com");
		driver.quit();
	}
}



