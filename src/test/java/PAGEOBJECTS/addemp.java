package PAGEOBJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addemp {
	
WebDriver ldriver;	
	@FindBy(xpath="(//a[@href=\"https://develop.vacisautomation.com/employees\"])[4]") WebElement emp;
	@FindBy(xpath="//a[@data-bs-target=\"#add_employee\"]") WebElement addemployee;
	
public addemp(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
	
public void aemp()
{
	emp.click();
}
public void addclick()
{
	addemployee.click();
}

}
