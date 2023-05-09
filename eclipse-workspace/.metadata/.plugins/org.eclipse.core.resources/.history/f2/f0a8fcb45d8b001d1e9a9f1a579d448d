package NobelPage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://nobelpagedev.iworklab.com/");

		String FirstNames = "Karan", LastNames = "Sahu", Emails = "karannp9911@yopmail.com", Password = "Karan123@";
		Integer Numbers = 2143658109;

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Account']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("auth-form-heading")).getText() + " Section is opened");

		WebElement FirstNameLabel = driver.findElement(By.xpath("//label[normalize-space()='First Name']"));
		System.out.print(FirstNameLabel.getText());
		WebElement FirstNameis = driver.findElement(
				By.xpath("//body//div[@id='root']//div[@class='row']//div[@class='row']//div[1]//div[1]//input[1]"));
		FirstNameis.sendKeys(FirstNames);
		System.out.println(" is " + FirstNames);

		WebElement LastNameLabel = driver.findElement(By.xpath("//label[normalize-space()='Last Name']"));
		System.out.print(LastNameLabel.getText());
		WebElement LastNameis = driver.findElement(By.cssSelector(
				"body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(2)"));
		LastNameis.sendKeys(LastNames);
		System.out.println(" is " + LastNames);

		WebElement EmailLabel = driver.findElement(By.xpath("//label[normalize-space()='Email']"));
		System.out.print(EmailLabel.getText());
		WebElement EmailNameis = driver.findElement(By.xpath("//input[@type='email']"));
		EmailNameis.sendKeys(Emails);
		System.out.println(" is " + Emails);

		WebElement PasswordLabel = driver.findElement(By.xpath("//label[normalize-space()='Password']"));
		System.out.print(PasswordLabel.getText());
		WebElement Passwordis = driver.findElement(By.xpath("//input[@type='password']"));
		Passwordis.sendKeys(Password);
		System.out.println(" is " + Password);

		/* Dropdown */
//		WebElement staticDropdown = driver.findElement(By.xpath("//div[@title='United States: + 1']"));
//		Select dropdown = new Select(staticDropdown);
//		dropdown.selectByVisibleText("//span[normalize-space()='+91']");
//		System.out.println(dropdown.getFirstSelectedOption().getText() + " : is selected from the static dropdown.");

		/* When dropdown is in Div not in select tag */
//		WebElement selectMyElement = driver.findElement(By.xpath("//div[@title='United States: + 1']")); 
//		selectMyElement.click();
//		Actions keyDown = new Actions(driver);
//		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

		driver.findElement(By.xpath("//div[@title='United States: + 1']")).click();
		List<WebElement> drpDownList = driver.findElements(By.xpath("//ul[@role='listbox'][1]//li"));
		System.out.println("Total country codes is "+ drpDownList.size());
		for (WebElement list : drpDownList) {
			if (list.getText().contains("+91")) {
				list.click();

				driver.findElement(
						By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[4]/div/div/input"))
						.sendKeys(String.valueOf(Numbers));
				break;

			}
		}

		WebElement PhoneNumberLabel = driver.findElement(By.xpath("//label[normalize-space()='Mobile']"));
		System.out.print(PhoneNumberLabel.getText());
		//WebElement PhoneNumberis = driver.findElement(By.xpath(""));
		//PhoneNumberis.sendKeys(String.valueOf(Numbers));
		System.out.println(" Number is " + String.valueOf(Numbers));

		driver.findElement(By.xpath("//button[normalize-space()='Join Community']")).click();
		Thread.sleep(5000);

	}

}
