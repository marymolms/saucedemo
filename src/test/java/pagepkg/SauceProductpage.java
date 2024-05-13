package pagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductpage {
	WebDriver driver;
	
	
	/*@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement pro1backpack;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement pro2bikelight;

	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement pro3Tshirt;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement pro4jacket;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement pro5onesie;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement pro6Tshirt;*/
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkout;
	
	public SauceProductpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addtocart() {
	/*	pro1backpack.click();
		pro2bikelight.click();
		pro3Tshirt.click();
		pro4jacket.click();
		pro5onesie.click();
		pro6Tshirt.click();*/
		
		List<WebElement> li=driver.findElements(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button"));
	    for(WebElement pr:li) {
	    		pr.click();	
	    }
	}
	public void cartclick() {
		cart.click();
	}
	public void clickcheckout() {
		checkout.click();
	}
}
