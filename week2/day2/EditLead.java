package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		// Enter a username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click the "Leads" link.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// Click on Create Lead.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// Enter the CompanyName Field Using Xpath.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("netTech");

		// Enter the FirstName Field Using Xpath.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Laxmi");

		// Enter the LastName Field Using Xpath
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vishnu");

		// Enter the FirstName (Local) Field Using Xpath
		driver.findElement(By.name("firstNameLocal")).sendKeys("lachu");

		// Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.name("departmentName")).sendKeys("SoftwareDelivery");

		// Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.name("description")).sendKeys("SoftwareDeveloper");

		// Enter your email in the E-mail address Field using the locator of your
		// choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("laxmi@gmail.com");

		// Select State/Province as NewYork Using Visible Text.
		Select state = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");

		// Click on the Create Button.
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);

		// Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		// Clear the Description Field.
		WebElement updateDescription = driver.findElement(By.id("updateLeadForm_description"));
		updateDescription.clear();

		// Fill the Important Note Field with Any text.
		updateDescription.sendKeys("SeniorSoftwareDeveloper");

		// Click on the update button.
		driver.findElement(By.name("submitButton")).click();

		// Get the Title of the Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);

		// Close the browser window.
		driver.close();

	}

}
