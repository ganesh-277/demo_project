package TESTPACK;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class baseclass {
public static WebDriver driver;
//confo_utility ut=new confo_utility();
//public String Baseurl=ut.geturl();
//public String Username=ut.getusername();
//public String Password=ut.getpassword();
@BeforeClass
public void start()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\new driver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//driver.get("https://develop.vacisautomation.com/dashboard");
	
	
}
//@AfterClass
public void teardown()
{
	driver.close();
}

}
