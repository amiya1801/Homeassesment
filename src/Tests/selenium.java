package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class selenium {

	@Test
	    public void sauceDemo() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		 driver.findElement(By.id("user-name"))
         .sendKeys("standard_user");

 driver.findElement(By.id("password"))
         .sendKeys("secret_sauce");
 driver.findElement(By.id("login-button"))
 .click();
 
 driver.findElement(By.id("item_4_title_link"))
 .click();
 driver.findElement(By.id("add-to-cart"))
 .click();
 driver.findElement(By.id("back-to-products"))
 .click();
 driver.findElement(By.id("item_3_title_link"))
 .click();
 driver.findElement(By.id("add-to-cart"))
 .click();
 driver.findElement(By.className("shopping_cart_link"))
 .click();
	 
 

 Assert.assertTrue(
		    driver.findElements(By.className("cart_button")).size() == 2,
		    "Both products should have a Remove button");
 System.out.println("Both products have a remove button");


 Assert.assertTrue(
	        driver.findElement(By.id("continue-shopping")).isDisplayed()
	);
 System.out.println("Continue Shopping button is displayed");
 

	Assert.assertTrue(
	        driver.findElement(By.id("checkout")).isDisplayed());
	System.out.println("Checkout button is displayed");


		driver.quit();
	}

}
