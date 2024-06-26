package browser_drivers;

import com.sun.deploy.config.DefaultConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class Opera {

    private static DefaultConfig system;

    public static void main(String[] args) {

        String setProperty = System.setProperty("webdriver.opera.driver", "C:\\Software\\Driver\\operadriver.exe");

        WebDriver driver=new OperaDriver();

driver.get("https://demo.nopcommerce.com");

String PageTitle=driver.getTitle();
        System.out.println("Page Title is:" +PageTitle);

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.manage().window().maximize();

        driver.close();

        driver.quit();
    }
}
