package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import javax.xml.xpath.XPath;
import java.time.Duration;

public class LoginTest {
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://bangbang.kz/gitary-i-oborudovanie/gitary/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnAccountBtn();
        loginPage.clickOnAccountBtn_next();
        loginPage.fillUserID("gizatov.arnur.gamzatovich@gmail.com");
        loginPage.fillPassword("Giz87017894048");
        loginPage.clickLoginBtn();
        Thread.sleep(1000);
    }

     @Test
   public void onHomePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnView();     //change View of list goods
         Thread.sleep(5000);

        homePage.clickOnHeart();    //add goods in favourite list
         Thread.sleep(10000);

         homePage.clickOnGoods();   //get in favourite
         Thread.sleep(3000);

         homePage.clickOnRemoveGoods();  // remove goods
         Thread.sleep(3000);

         homePage.clickOnReturnHome();   //return to homepage
         Thread.sleep(3000);

         homePage.clickOnTOAddBasket();  //add goods to basket
         Thread.sleep(10000);

         homePage.checkBasket1();     //check basket first step
         Thread.sleep(400);

         homePage.checkBasket2();    // check basket second step
         Thread.sleep(3000);

         homePage.removeGoodsFromBasket(); //remove goods from basket
         Thread.sleep(3000);

         homePage.clickOnTOContinueTOChoose(); // return to home page
         Thread.sleep(5000);

         homePage.searchingGoods("Stagg");
         Thread.sleep(1000);

   }

    @AfterSuite()
    public void close(){
        driver.close();
    }
}
