import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium01 {
    @Test
    public void app() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platormName","Android");
        desiredCapabilities.setCapability("platformVerison","12.0");
        desiredCapabilities.setCapability("deviceName","Xiaomi M2007J3SG");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\nurul\\IdeaProjects\\MobileTestAppiumm\\src\\Apps\\HM.apk");

        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);

        //9 tusuna tiklandi
        //driver.findElementById("com.google.android.calculator:id/digit_9").click();
        //Thread.sleep(3000);

        //Carpi isaretine tiklandi
        //driver.findElementById("com.google.android.calculator:id/op_mul").click();
        //Thread.sleep(3000);

        //Tekrar 9 tusuna tiklandi
        //driver.findElementById("com.google.android.calculator:id/digit_9").click();
        //Thread.sleep(3000);

        //Esittir tusuna tiklandi
        //driver.findElementById("com.google.android.calculator:id/eq").click();
        //Thread.sleep(5000);

        //7 tusuna tiklandi
        driver.findElementByAccessibilityId("7").click();
        Thread.sleep(3000);
        //carpi isaretine tiklandi
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"çarpı\"]").click();
        Thread.sleep(3000);
        //5 tusuna tiklandi
        driver.findElementByAccessibilityId("5").click();
        Thread.sleep(3000);
        //esittir simgesine basildi
        driver.findElementById("com.google.android.calculator:id/eq").click();
        Thread.sleep(3000);


    }
}
