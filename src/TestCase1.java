import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rajadas");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Incorrect cred");
		driver.close();

	}

}
