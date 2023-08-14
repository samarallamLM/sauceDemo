package saucedemoBySHAFT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;

public class Loginforsaucedemo {
	SHAFT.GUI.WebDriver driver;
	SHAFT.TestData.JSON testData;

    @Test
    public void LoginwithValidCredentails() {
        driver.browser().navigateToURL("https://www.saucedemo.com/");
        By Username = By.id("user-name");
        By Password = By.id("password");
        By LoginBtn = By.id("login-button");
        By filterlist = By.xpath("//select[@class='product_sort_container']");
        By HtoLOption= By.xpath("//option[@value='lohi']");
        By ProductLtH=By.id("add-to-cart-sauce-labs-onesie");
        By shoppingCartLink= By.xpath("//a[@class='shopping_cart_link']");
        By checkout = By.id("checkout");
        By Firstname =By.id("first-name");
        By Lastname =By.id("last-name");
        By ZipCode = By.id("postal-code");
        By ShoppingContinue =By.id("continue");
        By Shoppingfinish = By.id("finish");
        By orderassertion = By.xpath("//h2[text()='Thank you for your order!']");
        driver.element().type(Username,testData.getTestData("user_name"));
        driver.element().type(Password,testData.getTestData("password"));
        driver.element().click(LoginBtn);
        driver.element().click(filterlist);
        driver.element().click(HtoLOption);
        driver.element().click(ProductLtH);
        driver.element().click(shoppingCartLink);
        driver.element().click(checkout);
        driver.element().type(Firstname,testData.getTestData("First_name"));
        driver.element().type(Lastname,testData.getTestData("Last_name"));
        driver.element().type(ZipCode,testData.getTestData("ZipCode"));
        driver.element().click(ShoppingContinue);
        driver.element().click(Shoppingfinish);
        driver.element().isElementDisplayed(orderassertion);
        
    }
    @BeforeClass
    public void beforeClass() {
        driver = new SHAFT.GUI.WebDriver();
        testData = new SHAFT.TestData.JSON("simpleJSON.json");
        }

@AfterClass(alwaysRun = true)
public void afterClass(){
        driver.quit();
    }
}
