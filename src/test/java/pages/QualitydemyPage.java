package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {
    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[text()='Log in']")
        public WebElement ilkLoginLinki;
    @FindBy(xpath = "//*[@name='email']")
        public WebElement loginText;
    @FindBy(xpath = "//*[@name='password']")
        public WebElement loginPassword;
    @FindBy(xpath = "//button[text()='Login']")
        public WebElement ikinciLoginLinki;
    @FindBy(xpath = "//*[text()='Instructor']")
        public WebElement instructor;
    @FindBy(xpath = "//*[text()='Accept']")
        public WebElement cookies;
}
