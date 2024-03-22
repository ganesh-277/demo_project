package TESTPACK;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PAGEOBJECTS.add_dept;
import PAGEOBJECTS.add_salary;
import PAGEOBJECTS.addemp;
import PAGEOBJECTS.designation;
import PAGEOBJECTS.empinfo;
import PAGEOBJECTS.login;
import PAGEOBJECTS.payroll;
import UTILITY.confo_utility;

public class testclass extends baseclass{
	
	 @BeforeMethod
	    public void setUp() {
	       
	        driver.get("https://develop.vacisautomation.com/dashboard");
	    }
	
@Test(priority=0)
public void logintest() throws IOException
{
	
	confo_utility ut=new confo_utility();
	//driver.get(ut.geturl());
	
    login lg =new login(driver);
	lg.setusername(ut.getusername());
	lg.setpassword(ut.getpassword());
	lg.clkbtn();
	
	addemp ad=new addemp(driver);
	ad.aemp();
	ad.addclick();
	
	empinfo info=new empinfo(driver);
	
	info.empname(ut.fname());
	info.fname(ut.fatherN());
	info.email_id(ut.getemail());
	info.password(ut.getpasscode());
	info.emcode(ut.get_ecode());
	info.phn(ut.contact());
	info.dpart(ut.add_dept());
	info.designation(ut.add_dsgn());
	info.sel_role(ut.add_role());
	info.rmanager(ut.sel_pm());
	info.gender(ut.Sel_gen());
	info.sbt();
	
	
}
//@Test(priority=3)
public void paytest()
{
 //driver.get("https://develop.vacisautomation.com/dashboard");
	payroll roll=new payroll(driver);
	roll.clkpayroll();
	roll.clksalary_struct();
	
add_salary add=new add_salary(driver);
    add.addsalary();
    add.sel_st();
	add.chose_emp();
	add.gross_sal("100000");
	add.sel_bank("HDFC");
	add.bank_acct("885594034560777");
	add.enter_ifsc("hdfc0123456");
	add.ben_name("Ganesh Gadekar");
	add.uan_no("1238388488777");
	add.submit();
	
}
@Test(priority=2)
public void DEPT() 
{
	//driver.get("https://develop.vacisautomation.com/dashboard");

	add_dept add=new add_dept(driver);
	add.click_admin();
	add.click_dept();
	add.click_add_dept();
	add.enter_department("Social Media");
	add.click_submit();
	
	designation desi=new designation(driver);
	desi.designation();
	desi.clk_add_des();
	desi.enter_designation("Social Media Manager");
	desi.clk_sub();
}
@Test(priority=1)
public void DESI()
{
	designation desi=new designation(driver);
	desi.Administartor();
	desi.designation();
	desi.clk_add_des();
	desi.enter_designation("Social Media Manager");
	desi.clk_sub();
	
}


}
