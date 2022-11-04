import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\browerdrivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/"); 
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		//Thread.sleep(1000);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.className("a-label a-checkbox-label")).click();
		driver.navigate().to("http://edureca.co/blog");
		Thread.sleep(1000);
		driver.navigate().back();
		driver.quit();

	}

}
