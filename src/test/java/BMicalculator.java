import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.imageio.stream.ImageInputStream;

import static org.testng.Assert.assertEquals;

public class BMicalculator {
@Test
    public void calculatecmsNormal() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("82");
    //browser.findElement(By.name("wg")).sendKeys("82");
    browser.findElement(By.name("ht")).sendKeys("182");
    browser.findElement(By.name("cc")).click();
    String category = browser.findElement(By.name("desc")).getAttribute("value");
    new Select(browser.findElement(By.name("opt1")))
    assertEquals(category, "Your category is Normal", "Категория веса не совпадает с требуемой");
        browser.quit();

    }
}
