package tests.day16_testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_QalitydemyTest {

    @Test
    public void qualitydemyTesti(){
        //https://www.qualitydemy.com/ anasayfasına gidin
        Driver.getDriver().get("https://www.qualitydemy.com/ ");
        //Login linkine basın
        QualitydemyPage qualitydemyPage =new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.cookies.click();

        //Kullanci emaili olarak valid mail girin
        qualitydemyPage.loginText.sendKeys("anevzatcelik@gmail.com");
        //Kullanıcı şifresi olarak valid şifre girin
        qualitydemyPage.loginPassword.sendKeys("Nevzat152032");
        ReusableMethods.bekle(2);

        //Login butonuna basarak login olun

        qualitydemyPage.ikinciLoginLinki.click();
        //Başarılı olarak giriş yapıldıgını test edin
        Assert.assertTrue(qualitydemyPage.instructor.isDisplayed());

        ReusableMethods.tumSayfaFotografCek("qualitydemPage");

        Driver.closeDriver();
    }

}
