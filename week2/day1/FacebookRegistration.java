package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {

		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		// Click on the Create new account button.
		driver.findElement(By.xpath("//div[@class='_6ltg']/following::a[@data-testid='open-registration-form-button']"))
				.click();

		// Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("ram");

		// Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("k");

		// Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("rk5193016@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rk5193016@gmail.com");

		// Enter the New password.
		driver.findElement(By.name("reg_passwd__")).sendKeys("rk5193016");

		// Handle all three dropdowns in Date of birth

		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByValue("16");

		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Jul");

		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1995");

		// Select the radio button in Gender.
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//input[@value='2']")).click();

	}

}
