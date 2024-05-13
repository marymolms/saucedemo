package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauceloginpage {
      
	
	  WebDriver driver;
	   
	   @FindBy (id="user-name")
	   WebElement loginid;
	   
	   @FindBy(id="password")
	   WebElement pswd;
	   
	   @FindBy(id="login-button")
	   WebElement loginbutton;
	   
	   public Sauceloginpage(WebDriver driver) {

	   this.driver= driver;
	   PageFactory.initElements(driver, this);
	   
	   }
	   
	   public void setvalues(String un, String pwd) {
		   loginid.sendKeys(un);
		   pswd.sendKeys(pwd);
	   }
	   
	   public void loginclick() {
		   loginbutton.click();
	   }
}
