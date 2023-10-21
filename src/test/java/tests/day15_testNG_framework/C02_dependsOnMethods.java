package tests.day15_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02_dependsOnMethods {

    //uc tane test methodu olusturun
    //1- amazonTest : amazon anasayfaya gidip url nin amazon icerdigini test edelim
    //2-nutellaTest: Nutella için arama yapıp arama sonuclarının nutella icerdigini test edelim
    //3- ilkUrunTesti :ilk ürünü click yapıp ürün isminin Nutella içerdigini test edin



     @Test
    public void amazonTest (){
         Driver.getDriver().get("https://www.amazon.com");
         String expectedUrlIcerik ="amazon";
         String actualUrl=Driver.getDriver().getCurrentUrl();

         Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
     }
     @Test (dependsOnMethods = "amazonTest")
     public void nutellaTest(){
         WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
         aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

         WebElement sonucYaziElementi=Driver.getDriver().findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
         String expectedIcerik="Nutella";
         String actualSonucYazisi=sonucYaziElementi.getText();
         Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

     }
     @Test(dependsOnMethods = "nutellaTest")
    public void ilkUrunTesti(){

         Driver.getDriver().findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]")).click();

         WebElement productTitle=Driver.getDriver().findElement(By.id("productTitle"));

         String expectedIlkUrunBaslik="Nutella";
         String actualIlkUrunBaslik=productTitle.getText();
         Assert.assertTrue(actualIlkUrunBaslik.contains(expectedIlkUrunBaslik));

         Driver.closeDriver();


     }
}
