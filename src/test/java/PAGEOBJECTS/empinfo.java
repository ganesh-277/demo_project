package PAGEOBJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class empinfo {
WebDriver ldriver;	
@FindBy(xpath="(//input[@name=\"full_name\"])[1]")	WebElement name;
@FindBy(xpath="(//input[@id=\"father_name\"])[1]")	WebElement fathername;
@FindBy(xpath="(//input[@id=\"email\"])[1]")	WebElement mail;
@FindBy(xpath="(//input[@id=\"pwd\"])[1]")	WebElement pwd;
@FindBy(xpath="(//input[@id=\"emp_code\"])[1]")	WebElement empcode;
@FindBy(xpath="(//input[@placeholder=\"Enter Employees Contact Number\"])[1]")	WebElement phn;
@FindBy(xpath="(//select[@name=\"department\"])[1]")	WebElement dept;
@FindBy(xpath="(//select[@name=\"designation_id\"])[1]")	WebElement desgn;
@FindBy(xpath="(//select[@placeholder=\"Select Role\"])[1]")	WebElement rl;
@FindBy(xpath="(//select[@name=\"reportingmanager\"])[1]") WebElement rm;
@FindBy(xpath="(//select[@id=\"gender\"])[1]")	WebElement gen;
@FindBy(xpath="(//button[@id=\"btn-user\"])[1]") WebElement sub;

public empinfo(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
public void empname(String ename)
{
	name.sendKeys(ename);
}
public void fname(String fa_name)
{
fathername.sendKeys(fa_name);
}
public void email_id(String id)
{
	mail.sendKeys(id);
}
public void password(String pcode)
{
	pwd.sendKeys(pcode);
}
public void emcode(String ecode)
{
	empcode.sendKeys(ecode);
}
public void phn(String no)
{
	phn.sendKeys(no);
}
public void dpart(String deptm)
{
	Select sel=new Select(dept);
	sel.selectByVisibleText(deptm);	
}
public void designation(String dsg)
{
	Select sel=new Select(desgn);
	sel.selectByVisibleText(dsg);	
}
public void sel_role(String role)
{
	Select sel=new Select(rl);
	sel.selectByVisibleText(role);	
}
public void rmanager(String rmg)
{
	Select sel=new Select(rm);
	sel.selectByVisibleText(rmg);	
}
public void gender(String gd)
{
	Select sel=new Select(gen);
	
	sel.selectByVisibleText(gd);	
}
public void sbt()
{
sub.click();
}
}
