package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailKutusu;
    @FindBy(xpath = "//*[@name='pass']")
    public  WebElement sifreKutusu;
    @FindBy(xpath = "//*[@name='login']")
   public WebElement girisBtn;
    @FindBy(xpath = "(//a[@role='button'])[2]")
    public  WebElement yeniHesap;
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girisYalilamadiYaziElementi;



}
