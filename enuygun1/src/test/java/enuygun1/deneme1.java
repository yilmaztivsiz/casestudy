package enuygun1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deneme1 {

	WebDriver driver;
		
	@Test
	public void rezervasyon() throws InterruptedException {
		
		
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "yilmaztivsiz@gmail.com";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.enuygun.com/");
		driver.manage().window().maximize();
		WebElement fromwhere = driver.findElement(By.id("OriginInput"));
		fromwhere.sendKeys("istanbul");
		fromwhere.sendKeys(Keys.ARROW_DOWN);
		fromwhere.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement towhere = driver.findElement(By.id("DestinationInput"));
		towhere.sendKeys("venedik");
		Thread.sleep(2000);
		towhere.sendKeys(Keys.ARROW_DOWN);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		towhere.sendKeys(Keys.ENTER);
		driver.findElement(By.id("oneWayCheckbox")).click();
		driver.findElement(By.xpath("//*[@id=\"FlightSearchForm\"]/div[2]/div[1]/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"FlightSearchForm\"]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[4]/td[1]/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"FlightSearchForm\"]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[5]/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"FlightSearchForm\"]/div[3]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"SearchRoot\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/label[1]/div[1]/div/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"SearchRoot\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/label[1]/div[1]/div/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tooltipTarget_0")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("contact_email")).sendKeys("yilmaztivsiz@gmail.com");
		driver.findElement(By.id("contact_cellphone")).sendKeys("388350663");
		driver.findElement(By.id("firstName_0")).sendKeys("Yılmaz");
		driver.findElement(By.id("lastName_0")).sendKeys("Tivsiz");
		WebElement gun = driver.findElement(By.id("birthDateDay_0"));
		Select select1 = new Select(gun);
		select1.selectByValue("12");
		WebElement ay = driver.findElement(By.id("birthDateMonth_0"));
		Select select2 = new Select(ay);
		select2.selectByValue("06");
		WebElement yil = driver.findElement(By.id("birthDateYear_0"));
		Select select3 = new Select(yil);
		select3.selectByValue("1996");
		driver.findElement(By.id("publicId_0")).sendKeys("60160419838");
		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id=\"passenger-form\"]/div[5]/label/div[2]/div/div/input"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(radiobutton1);
		actions1.perform();
		driver.findElement(By.xpath("//*[@id=\"passenger-form\"]/div[5]/label/div[2]/div/div/input")).click();
		WebElement radiobutton2 = driver.findElement(By.xpath("//*[@id=\"passenger-form\"]/div[8]/a"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(radiobutton2);
		actions2.perform();
		driver.findElement(By.id("assurance")).click();
		driver.findElement(By.xpath("//*[@id=\"passenger-form\"]/div[9]/div[1]/div/div[2]/button")).click();
		String actualtext = driver.findElement(By.xpath("//*[@id=\"emailValidationContainer\"]/input")).getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Rezervasyon olusturulamadi.");
		softassert.assertAll();
		driver.close();
	}
		
}

