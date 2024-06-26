import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuiclFirefoxBrowserBonigarcia {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("abcd");
        driver.findElement(By.id("LastName")).sendKeys("efgh");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("21");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1970");
        driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test123");
        //driver.findElement(By.id("register-button")).click();
        //driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")).click();


    }
}
