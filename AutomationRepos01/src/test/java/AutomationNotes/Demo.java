package AutomationNotes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("D:\\Desktop\\saurabh\\Selenium\\gitHubDummy\\AutomationRepos01\\src\\test\\java\\AutomationNotes\\Welcome.html");
		Thread.sleep(3000);
		
		driver.quit();
	}

}

