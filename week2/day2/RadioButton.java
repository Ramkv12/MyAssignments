package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		// Select 'Your most favourite browser' from the radio buttons

		driver.findElement(By.xpath("(//table[@id='j_idt87:console1']/tbody/tr/td/div/div[2]/span)[1]")).click();

		// Click on a radio button, then click on the same radio button again to verify
		// that it becomes ‘unselected’.

		WebElement radioButton = driver.findElement(By.xpath("(//div[@id='j_idt87:city2']/div/div/div/div[2])[1]"));
		radioButton.click();
		radioButton.click();

		boolean selected = radioButton.isSelected();

		if (selected == false) {

			System.out.println("RadioButton Not selected");
		}

		else
			System.out.println("RadioButton selected");

		// Identify the radio button that is initially selected by default.

		List<WebElement> defaultSelect = driver
				.findElements(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td/div"));

		for (int i = 0; i < defaultSelect.size(); i++) {

			boolean selectedButton = defaultSelect.get(i).isSelected();

			if (selectedButton == true) {

				String name = defaultSelect.get(i).getText();
				System.out.println(name);

			}

		}

		// Check and select the age group (21-40 Years) if not already selected.

		WebElement ageSelect = driver.findElement(By.xpath("(//div[@id='j_idt87:age']/div/div/div)[2]"));
		boolean selected2 = ageSelect.isSelected();
		if (selected2 == false) {
			ageSelect.click();

		} else
			System.out.println("age group (21-40 Years) already selected");

	}

}
