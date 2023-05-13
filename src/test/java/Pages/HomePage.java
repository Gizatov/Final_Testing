package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"pagination_contents\"]/div[2]/div[2]/div[3]/a[3]/i")
    WebElement view_change;

    @FindBy(xpath = "//*[@id=\"button_wishlist_565\"]/i")
    WebElement addInFavorite;

    @FindBy(xpath = "//*[@id=\"abt__ut2_wishlist_count\"]/a")
    WebElement checkGoods;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div/div/div/div/div[2]/a[1]")
    WebElement removeGoods;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div/div/div/div/div[2]/a")
    WebElement returnToHomePage;

    @FindBy(xpath = "//*[@id=\"button_cart_565\"]")
    WebElement addToBasket;

    @FindBy(xpath = "//*[@id=\"sw_dropdown_2333\"]/a")
    WebElement checkBasket1;

    @FindBy(xpath = "//*[@id=\"dropdown_2333\"]/div/div[2]/div[1]/a")
    WebElement checkBasket2;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div/div/div/div/div[3]/div[1]/a[2]")
    WebElement removeGoodsFromBasket;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[3]/div/div[2]/div/div/div/div/div/a")
    WebElement continueToChoosingGoods;

    @FindBy(id = "search_input")
    WebElement searchFld;

    @FindBy(xpath = "//*[@id=\"tygh_main_container\"]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div/form/button")
    WebElement clickONSearchBtn;

    @FindBy(xpath = "//*[@id=\"det_img_1360desktop\"]")
    WebElement clickOnImgMediator;

    @FindBy(xpath = "//*[@id=\"dsc_name_bigpicture_1360\"]")
    WebElement YourNameFld;

    @FindBy(xpath = "//*[@id=\"rating_bigpicture_1360\"]/label[2]")
    WebElement Stars;

    @FindBy(xpath = "//*[@id=\"dsc_message_bigpicture_1360\"]")
    WebElement messageAreaFld;

    @FindBy(xpath = "//*[@id=\"add_post_form_bigpicture_1360\"]/div[2]/button")
    WebElement SendBtn;

    @FindBy(xpath = "//*[@id=\"breadcrumbs_11\"]/div/a[2]")
    WebElement Return_ToChosingGoods;

    @FindBy(xpath = "//*[@id=\"sw_elm_sort_fields\"]")
    WebElement sort;

    @FindBy(xpath = "//*[@id=\"elm_sort_fields\"]/li[3]/a")
    WebElement choose_sorting;



    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clickOnView(){
        view_change.click();
    }
    public void clickOnHeart(){
        addInFavorite.click();
    }
    public void clickOnGoods(){
        checkGoods.click();
    }
    public void clickOnRemoveGoods(){
        removeGoods.click();
    }
    public void clickOnReturnHome(){
        returnToHomePage.click();
    }
    public void clickOnTOAddBasket(){
        addToBasket.click();
    }
    public void checkBasket1(){
        checkBasket1.click();
    }
    public void checkBasket2(){
        checkBasket2.click();
    }
    public void removeGoodsFromBasket(){
        removeGoodsFromBasket.click();
    }
    public void clickOnTOContinueTOChoose(){
        continueToChoosingGoods.click();

    }
    public void searchingGoods(String search){
        searchFld.sendKeys(search);
    }

    public void ClickONSearchBtn(){
        clickONSearchBtn.click();
    }

    public void imgClick(){
        clickOnImgMediator.click();
    }
    public void yournamefld(String name){
        YourNameFld.sendKeys(name);
    }
    public void Stars(){
        Stars.click();
    }
    public void AreAfLD(String areaFld){
        messageAreaFld.sendKeys(areaFld);
    }
    public void SendBtn(){
        SendBtn.click();
    }
    public void Return_ToChosingGoods(){
        Return_ToChosingGoods.click();
    }
    public void sort(){
        sort.click();
    }
    public void Choose_sorting(){
        choose_sorting.click();
    }

    public double compare(double a, double b){
        if(a > b){
            return a;
        }else
        return b;
    }


}