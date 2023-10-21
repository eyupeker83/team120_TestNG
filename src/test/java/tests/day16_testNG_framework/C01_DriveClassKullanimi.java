package tests.day16_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriveClassKullanimi {

    @Test
    public void amazonTest(){
        //amazon ana sayfaya gidelim
        //Nutella için arama yapalım



        Driver.getDriver().get("https://www.amazon.com");

        WebElement aramaKutusu= Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }

    @Test
    public void youtubeTesti(){
        Driver.getDriver().get("https://www.youtube.com");
    }
}
