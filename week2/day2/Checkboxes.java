package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {

		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the URL https://leafground.com/checkbox.xhtml
		driver.get("https://leafground.com/checkbox.xhtml");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		// Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')]//div)[2]")).click();

		// Click on the "Notification Checkbox."
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')]//div)[4]")).click();
		Thread.sleep(2000);
		// Verify that the expected message is displayed.
		String verMessage = driver.findElement(By.className("ui-growl-title")).getText();
		System.out.println(verMessage);
		Thread.sleep(2000);

		// Click on your favorite language (assuming it's related to checkboxes).
		//String favoriteLanguage = "Java";
		driver.findElement(By.xpath(
				"(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();

		// Click on the "Tri-State Checkbox.
		WebElement triCheck = driver.findElement(By.xpath("//div[contains(@id,'TriState')]"));
		triCheck.click();

		// Verify which tri-state option has been chosen.
		if (triCheck.isEnabled()) {
			System.out.println("tri-state option has been chosen");

		} else
			System.out.println("tri-state option has been not chosen");

		// Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(2000);

		// Verify that the expected message is displayed.
		// String verMessage =
		// driver.findElement(By.className("ui-growl-title")).getText();
		System.out.println(verMessage);
		Thread.sleep(2000);

		// Verify if the Checkbox is disabled.

		WebElement checkBox = driver.findElement(By.xpath(
				"(//div[contains(@class,'ui-selectbooleancheckbox')]/div[contains(@class,'ui-chkbox-box')])[3]"));

		if (checkBox.isEnabled()) {
			System.out.println("Checkbox is enabled");
		} else
			System.out.println("Checkbox is disabled");

		// Select multiple options on the page (details may be needed).
		// String cityName = "Miami";
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		// Close the web browser when done.
		driver.close();

	}

}
