package PAGEOBJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class add_dept {

WebDriver ldriver;

public add_dept(WebDriver rdriver)
{
	this.ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="//span[text()=\" Administrator \"]") WebElement admint;
@FindBy(xpath="(//a[text()=\"Departments\"])[2]") WebElement dept;
@FindBy(xpath="//a[@data-bs-target=\"#add_department\"]") WebElement add_dept;
@FindBy(xpath="(//input[@id=\"department\"])[1]") WebElement enter_dept;
@FindBy(xpath="//button[@id=\"btn-department\"]") WebElement clk_sb;




public void click_admin()
{
	admint.click();
}
public void click_dept()
{
	dept.click();
}
public void click_add_dept()
{
	add_dept.click();
}
public void enter_department(String name_dept)
{
	enter_dept.sendKeys(name_dept);
}
public void click_submit()
{
	clk_sb.click();
}
}