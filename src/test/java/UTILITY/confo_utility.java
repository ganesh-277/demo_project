package UTILITY;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class confo_utility {
Properties pro;	
String path="C:\\Users\\admin\\eclipse-workspace\\VASCIS_DEMO\\cred.properties"	;
public confo_utility() throws IOException
{
	pro=new Properties();
	
	try(FileInputStream file=new FileInputStream(path))
	{
	    pro.load(file);
	}

	
}


public String geturl()
{
	 String url = pro.getProperty("URL");
	 return url;
}
public String getusername()
{
	 String uname = pro.getProperty("EMAIL");
	 return uname;
}
public String getpassword()
{
	 String pass = pro.getProperty("PASSWORD");
	 return pass;
}
public String fname()
{
	 String name = pro.getProperty("fullname");
	 return name;
}

public String getemail()
{
	 String eid = pro.getProperty("em_id");
	 return eid;
}
public String getpasscode()
{
	 String pa = pro.getProperty("password");
	 return pa;
}
public String get_ecode()
{
	 String ed= pro.getProperty("emp_code");
	 return ed;
}
public String contact()
{
	 String phn = pro.getProperty("phone_no");
	 return phn;
}
public String add_dept()
{
	 String dt = pro.getProperty("department");
	 return dt;
	 
}

public String add_dsgn()
{
	 String ds = pro.getProperty("designation");
	 return ds;
}
public String add_role()
{
	 String rl = pro.getProperty("Role");
	 return rl;
}
public String sel_pm()
{
	 String rm = pro.getProperty("Reporting_Manager");
	 return rm;
}
public String Sel_gen()
{
	 String gn = pro.getProperty("gender");
	 return gn;
}

}
