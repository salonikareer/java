import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class App implements App {
    /**
     * @param <WebDriver>
     * @param args
     * @throws Exception
     */
    public static <WebDriver> void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\java\\java1\\src\\driver\\chromedriver.exe");
        final WebDriver driver = new ChromeDriver();

        ((Object) driver).get("https://demo.guru99.com/test/newtours/register.php");

        Thread.sleep(1000);

        WebElement first_name = driver.findElement(By.name("firstName"));
        first_name.sendKeys("Saloni");

        Thread.sleep(1000);

        WebElement last_name = driver.findElement(By.name("lastName"));
        last_name.sendKeys("Kareer");

        Thread.sleep(1000);

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("9492929292");

        Thread.sleep(1000);

        WebElement username = driver.findElement(By.name("userName"));
        username.sendKeys("fit@gmail.com");

        Thread.sleep(1000);

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("Hoshiarpur");

        Thread.sleep(1000);

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Hoshiarpur");

        Thread.sleep(1000);

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("punjab");

        Thread.sleep(1000);

        WebElement pinCode = driver.findElement(By.name("postalCode"));
        pinCode.sendKeys("160015");

        Thread.sleep(1000);

        Select countryList = new Select(driver.findElement(By.name("country")));
        countryList.selectByValue("INDIA");

        Thread.sleep(1000);

        WebElement loginUserName = driver.findElement(By.id("email"));
        loginUserName.sendKeys("fitme@email,com");

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("hi1234");

        Thread.sleep(1000);

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("hi1234");

        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();

        Thread.sleep(5000);
        driver.quit();

    }
}