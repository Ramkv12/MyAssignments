package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		// Click on the button with the text ‘Click and Confirm title.
		driver.findElement(By.xpath("//button[@type='button']/span[text()='Click']")).click();

		// Verify that the title of the page is ‘dashboard.’
		String inputTitle = "Dashboard";
		String outputTitle = driver.findElement(By.xpath("//div[@class='route-bar-breadcrumb']/i")).getText();

		if (outputTitle.contains(inputTitle)) {
			System.out.println(outputTitle);
		}

		else
			System.out.println("Title mismatched");

		// Check if the button with the text ‘Confirm if the button is disabled’ is
		// disabled.

		driver.findElement(By.xpath("//i[contains(@class,'pi-server')]")).click();
		driver.findElement(By.className("rotated-icon")).click();

		WebElement disableButton = driver.findElement(By.xpath("//button[@disabled='disabled']"));

		boolean enabled = disableButton.isEnabled();

		if (enabled) {
			System.out.println("Button Enabled");
		}

		else
			System.out.println("Button Disabled");

		// Find and print the position of the button with the text ‘Submit.’

		WebElement submitButton = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		String submitButtonText = submitButton.getText();
		System.out.println(submitButtonText);

		// Find and print the background color of the button with the text ‘Find the
		// Save button color.’
		String backgroundColor = driver
				.findElement(By.xpath("(//span[contains(@class,'ui-button-icon-left ui-icon')])[2]"))
				.getAttribute("background-color");
		System.out.println(backgroundColor);

		// Find and print the height and width of the button with the text ‘Find the
		// height and width of this button.’

		Dimension heightWidth = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println(heightWidth);

		// Close the browser window
		// driver.close();
	}

}
