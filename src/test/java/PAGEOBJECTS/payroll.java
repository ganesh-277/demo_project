package PAGEOBJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payroll {
WebDriver ldriver;

public payroll(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="//span[text()=\" Payroll \"]") WebElement pay;
@FindBy(xpath="(//a[@href=\"https://develop.vacisautomation.com/salary-structure\"] )[1]") WebElement salary_struct;











public void clkpayroll()
{

	pay.click();
}
public void clksalary_struct()
{
	salary_struct.click();
}

}
