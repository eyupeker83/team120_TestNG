package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    /*
    TestNG de page classları sürekli kullandıgımız bir sayfa
    veya web sitesindeki locate leri ve ilgili sayfada kullanılacak
    login gibi basit methodları içerir.

    TestNG page classlarındaki locate lere erişim için
    Test Classlarında page classından obje oluşturulmasını benimsemiştir.


     */

public AmazonPage(){
    PageFactory.initElements(Driver.getDriver(),this);



    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucyaziElementi;

    @FindBy(xpath = "(//*[@class='a-section aok-relative s-image-square-aspect'])[1]")
    public WebElement amazonIlkUrun;
}
