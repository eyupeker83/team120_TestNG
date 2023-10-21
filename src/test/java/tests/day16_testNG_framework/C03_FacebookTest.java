package tests.day16_testNG_framework;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_FacebookTest {

    @Test
    public void facebookTesti(){
        //1-https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        //2-Pom a uygun olarak email,sifre kutularini ve giris yap butonunu locate edin
        ReusableMethods.bekle(2);
        //3- Faker class ini kullanarak email ve sifre degerlerini yazdirip , giris butonuna basin
        Faker faker=new Faker();
        FacebookPage facebookPage=new FacebookPage();

        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.sifreKutusu.sendKeys(faker.internet().password());
        facebookPage.girisBtn.click();
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYalilamadiYaziElementi.isDisplayed());
        ReusableMethods.tumSayfaFotografCek("facebook");

        Driver.closeDriver();
    }

}
