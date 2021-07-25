package SeleiumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guest1\\Desktop\\geckodriver.exe");

	}

}
