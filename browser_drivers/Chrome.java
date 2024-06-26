package browser_drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Driver\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();

driver.get("https://demo.nopcommerce.com/");

String PageTitle=driver.getTitle();
        System.out.println("Page Title is:" +PageTitle);

driver.navigate().back();

driver.navigate().forward();

driver.navigate().refresh();

driver.manage().window().maximize();

        System.out.println("Current url is:"+driver.getCurrentUrl());

driver.close();

driver.quit();





    }
}
