package browser_drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public static void main(String[] args) {

        String setProperty = System.setProperty("webdriver.gecko.driver", "C:\\Software\\Driver\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();

driver.get("https://demo.nopcommerce.com/");

String PageTitle=driver.getTitle();

        System.out.println("Print Title is:" +PageTitle);

driver.navigate().back();

driver.navigate().forward();

driver.navigate().refresh();

driver.manage().window().maximize();

        System.out.println("Current Url is:"+driver.getCurrentUrl());


driver.close();

driver.quit();

    }
}
