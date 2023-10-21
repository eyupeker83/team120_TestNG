package tests.day15_testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Priority {
    int a=20;
    int b=10;

    @Test(priority = 4)
    public void  carpmaTesti(){
        //Sayıların çarpımının 100'den büyük oldugunu test edin

        Assert.assertTrue(a*b>100);
    }
    @Test(priority = 5)
    public void toplamaTesti(){
        // sayıların toplamının  pozitif oldugunu test edin

        Assert.assertTrue(a+b>0);
    }
    @Test(priority = 6)
    public void cikarmaTesti(){

        //a ile b nin farkının mutlak değerinin 100 den küçük oldugnu test edin.

        Assert.assertTrue((a-b)>-100 && (a-b)<100);
    }

}
/*
TestNG hiç bir müdahale olmazsa testleri isim sırasına göre çalıştırır.
(carpma,cikarma,toplama)


testlere vereceğimiz priority değerleri küçükten büyüğe göre çalışır.
priority atamazsak default olarak priority =0 olarak kalır.
Aynı priority değerine sahip birden fazla method varsa bunlar kendi içerisinde
harf sırasına göre çalışır.

 */
