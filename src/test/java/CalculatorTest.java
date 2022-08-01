import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CalculatorTest {
    public static void main(String[] args) {
        try {
            openCulculator();

        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            System.out.println(exp.getStackTrace());

        }

    }

    static AppiumDriver<MobileElement> driver;

    public static void openCulculator() throws Exception {
        DesiredCapabilities cal = new DesiredCapabilities();
        cal.setCapability("deviceName", "Galaxy s20 FE");
        cal.setCapability("udId", "RZ8NA1BE8AY");
        cal.setCapability("platformName", "Android");
        cal.setCapability("platformVersion", "12");
        cal.setCapability("appPackage", "com.meesho.supply");
        cal.setCapability("appActivity", "com.meesho.supply.main.DeeplinkResolverActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cal);

        System.out.println("Application stared ......");
    }

}
