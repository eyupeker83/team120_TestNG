package tests.day16_testNG_framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {

    @Test
    public void nutellaTesti(){

        //amazon a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //Nutella için arama yapalım
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonuçlarının Nutella içerdiğini test edelim
        String actualAramaSonucu=amazonPage.sonucyaziElementi.getText();
        String expectedAramaIcerik="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedAramaIcerik));
        //Driver i kapatalım
        Driver.closeDriver();

    }
}
