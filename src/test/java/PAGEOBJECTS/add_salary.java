package PAGEOBJECTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class add_salary {
WebDriver ldriver;

public add_salary(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	
}

@FindBy(xpath="//a[@onclick=\"OpenSalaryStructurePopup();\"]") WebElement add_sal;
@FindBy(xpath="//span[text()=\"Select Staff \"]") WebElement sel;

@FindBy(xpath="(//ul[@class=\"chosen-results\"])/li[2]") WebElement chose;
@FindBy(xpath="(//input[@name=\"grossSalary\"])[1]") WebElement gross;
@FindBy(xpath="//input[@id=\"bankName\"]") WebElement bank;
@FindBy(xpath="//input[@id=\"bankAccountNo\"]") WebElement acct_no;
@FindBy(xpath="//input[@id=\"ifscCode\"]") WebElement ifsc;
@FindBy(xpath="//input[@id=\"customerNameBank\"]") WebElement customer;
@FindBy(xpath="(//input[@id=\"pf_uan_number\"])[1]") WebElement uan;
@FindBy(xpath="//button[@class=\"btn btn-primary submit-btn salaryFrmSubmit\"]") WebElement sub;





public void addsalary()
{
	add_sal.click();
}
public void sel_st()
{
	sel.click();
}

public void chose_emp()
{
	chose.click();
}
public void gross_sal(String gro)
{
	gross.sendKeys(gro);
}
public void sel_bank(String bankname)
{
	bank.sendKeys(bankname);
}
public void bank_acct(String ac_num)
{
	acct_no.sendKeys(ac_num);
}
public void enter_ifsc(String ifsc_no)
{
	ifsc.sendKeys(ifsc_no);
}
public void ben_name(String ben_num)
{
	customer.sendKeys(ben_num);
}
public void uan_no(String un)
{
	uan.sendKeys(un);
}
public void submit()
{
	sub.click();
}


}
