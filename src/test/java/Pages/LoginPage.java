package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"sw_dropdown_128\"]")
    WebElement AccountBnt;

    @FindBy(xpath = "//*[@id=\"dropdown_128\"]/div[2]/a[1]")
    WebElement AccountBnt_next;

    @FindBy(xpath = "//*[@id=\"login_popup2334\"]")
    WebElement userIdFld;

    @FindBy(xpath = "//*[@id=\"psw_popup2334\"]")
    WebElement passwordFld;

    @FindBy(xpath = "//*[@id=\"popup2334_login_popup_form_container\"]/form/div[4]/div[1]/button")
    WebElement loginBtn;


    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillUserID(String userId){
        userIdFld.sendKeys(userId);
    }

    public void fillPassword(String password){
        passwordFld.sendKeys(password);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }
    public void clickOnAccountBtn(){
        AccountBnt.click();
    }
    public void clickOnAccountBtn_next(){
        AccountBnt_next.click();
    }


}
