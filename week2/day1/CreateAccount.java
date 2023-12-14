package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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

		// Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();

		// Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();

		// Enter an account name Enter a description as "Selenium Automation Tester."
		String AccName = "Selenium Automation Tester - Ramkumar";
		driver.findElement(By.id("accountName")).sendKeys(AccName);

		// Select "ComputerSoftware" as the industry.
		Select industry = new Select(driver.findElement(By.name("industryEnumId")));
		industry.selectByValue("IND_SOFTWARE");

		// Select "S-Corporation" as ownership using SelectByVisibleText.
		Select ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		ownership.selectByVisibleText("S-Corporation");

		// Select "Employee" as the source using SelectByValue.
		Select source = new Select(driver.findElement(By.name("dataSourceId")));
		source.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" as the marketing campaign using
		// SelectByIndex.
		Select marketingCampaign = new Select(driver.findElement(By.name("marketingCampaignId")));
		marketingCampaign.selectByIndex(5);

		// Select "Texas" as the state/province using SelectByValue.
		Select state = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByValue("TX");

		// Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);

		// Verify that the account name is displayed correctly
		WebElement accountName = driver.findElement(
				By.xpath("//span[@class='requiredField']/following::span[contains(text(),'" + AccName + "')]"));
		String name = accountName.getText();

		if (name.contains(AccName)) {

			System.out.println("Account Created Successfully with the name " + name);
		}

		else
			System.out.println("Account Not Created");

		// Close the browser window
		driver.close();

	}

}
