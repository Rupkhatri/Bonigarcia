import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QuickEdgeBrowserBonigarcia {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName")).sendKeys("abcd");

        driver.findElement((By.id("LastName"))).sendKeys("efgh");

        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("21");

        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("November");

        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1970");

        driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("Test123");

        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test123");

        //driver.findElement(By.id("register-button")).click();








    }
}
