import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().setScriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://www.tunisianet.com.tn");

		Thread.sleep(1500);
        WebElement element = driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
        element.click();

        Thread.sleep(1500);
        element = driver.findElement(By.cssSelector(".user-down > li > a > span"));
        element.click();

        element = driver.findElement(By.cssSelector(".form-group > div > input"));
        element.sendKeys("rihab.cheberli@gmail.com");
        element = driver.findElement(By.cssSelector(".form-group > div > div > input"));
        element.sendKeys("123456");

        element = driver.findElement(By.id("submit-login"));
        element.click();

        element = driver.findElement(By.className("search_query"));
        element.sendKeys("PC portable MacBook M1 13.3");
        element = driver.findElement(By.cssSelector("#sp-btn-search > button"));
        element.click();

        List<WebElement> productsTitle = driver.findElements(By.className("product-title"));
        productsTitle.get(0).click();

        element = driver.findElement(By.className("add-to-cart"));
        element.click();

        element = driver.findElement(By.cssSelector("a.btn-block"));
        element.click();

        element = driver.findElement(By.cssSelector(".checkout > div > a"));
        element.click();

        element = driver.findElement(By.name("address1"));
        element.sendKeys("Korba");
        
        element = driver.findElement(By.name("postcode"));
        element.sendKeys("8070");
        
        element = driver.findElement(By.name("city"));
        element.sendKeys("Nabeul");
        
        element = driver.findElement(By.name("phone"));
        element.sendKeys("55249513");
        
        element = driver.findElement(By.name("confirm-addresses"));
        element.click();

        Thread.sleep(1500);
        element = driver.findElement(By.name("confirmDeliveryOption"));
        element.click();

        Thread.sleep(1500);
        element = driver.findElement(By.id("payment-option-1"));
        element.click();
        
        element = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        element.click();
        
        driver.quit();
	}

}
