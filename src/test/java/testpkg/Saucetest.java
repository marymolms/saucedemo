package testpkg;



import org.testng.annotations.Test;

import basepakg.Saucebaseclass;
import pagepkg.SauceHomeandlogooutpage;
import pagepkg.SauceProductpage;
import pagepkg.Sauceinformationpage;
import pagepkg.Sauceloginpage;
import utilitypkg.Sauceexcel;

public class Saucetest extends  Saucebaseclass{
	
	@Test(priority = 1)
	
public void logintest() {
		Sauceloginpage ob=new Sauceloginpage(driver);
		
		String xl= "F:\\MARYMOL\\java\\excel\\sauce.xlsx";
		String sheet= "Sheet1";
		
		int rowcount=Sauceexcel.getRowCount(xl, sheet);
		for(int i=1;i<=rowcount;i++) {
			String username = Sauceexcel.getcellvalue(xl, sheet, i, 0);
			System.out.println("username = "+username);
           String password = Sauceexcel.getcellvalue(xl, sheet, i, 1);
   		System.out.println("password = "+password);
   		

   		ob.setvalues(username, password);
   		ob.loginclick();
   		driver.navigate().refresh();
		}
	}
	
	
	@Test(priority = 2)
	public void addtocarttest() throws Exception {
		SauceProductpage ob1= new SauceProductpage(driver);
		Thread.sleep(5000);
		ob1.addtocart();
		Thread.sleep(5000);

		ob1.cartclick();
		Thread.sleep(5000);
		ob1.clickcheckout();
	}
	
	@Test(priority = 3)
	public void informationvaluestest() throws Exception {
		Sauceinformationpage ob2=new Sauceinformationpage(driver);
		ob2.information();
		Thread.sleep(5000);

		ob2.clickcontinue();
		Thread.sleep(5000);

	}
	@Test(priority = 4)
	public void logoouttest() throws Exception {
		SauceHomeandlogooutpage ob3= new SauceHomeandlogooutpage(driver);
		ob3.backhome();
		Thread.sleep(5000);

		ob3.logout();
		Thread.sleep(2000);
	}
	

}
