import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HepsiBurada {
    @Test
    public void setUpHepsiBurada() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platormName","Android");
        caps.setCapability("platformVerison","12.0");
        caps.setCapability("deviceName","Xiaomi M2007J3SG");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app","C:\\Users\\nurul\\IdeaProjects\\MobileTestWithAppium\\src\\Apps\\hepsiBurada.apk");

        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Close\"]").click();

        driver.findElementById("com.pozitron.hepsiburada:id/etSearchBox").click();

        driver.findElementById("com.pozitron.hepsiburada:id/etSearchBox").sendKeys("İphone 14");

        driver.findElementByXPath("//android.widget.TextView[@text='iphone 14']").click();

        //driver.findElementByXPath("//android.widget.Button[@text='SEPETE EKLE']").click();

        String actualUrun= driver.findElementById("com.pozitron.hepsiburada:id/tv_toolbar_editable_title").getText();


        String expectedUrun="iphone 14";

        Assert.assertTrue(actualUrun.contains(expectedUrun));

    }
}
