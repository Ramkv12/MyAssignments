package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteExistingLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		// Enter a username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click the "Leads" link.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// Click "Find leads.
		WebElement findLeadsMenu = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLeadsMenu.click();

		// Click on the "Phone" tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		// Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("0000");

		// Click the "Find leads" button.
		WebElement findLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads.click();
		Thread.sleep(2000);

		// Capture the lead ID of the first resulting lead.
		WebElement firstID = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]"));
		String leadId = firstID.getText();
		Thread.sleep(2000);
		// Click the first resulting lead.
		firstID.click();

		// Click the "Delete" button.
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
		Thread.sleep(3000);

		// Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();

		// Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		Thread.sleep(3000);

		// Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// Verify the presence of the message "No records to display" in the Lead List.
		// This
		// message confirms the successful deletion.

		String validationMessage = driver.findElement(By.xpath("(//div[@class='x-panel-bbar']//div)[2]")).getText();
		System.out.println(validationMessage);

	}

}
