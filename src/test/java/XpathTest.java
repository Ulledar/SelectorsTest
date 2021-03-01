import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class XpathTest extends BaseTest {
    String searchField = "//input[@class='textfield']";
    String searchButton = "//input[@class='button']";
    String seleniumHeader = "//a[contains(text(),'Selenium Java')]";
    String seleniymTitle = "Maven Repository: org.seleniumhq.selenium » selenium-java";

    @Test
    public void seleniumFinder() {
        driver.findElement(By.xpath(searchField)).sendKeys("selenium");
        driver.findElement(By.xpath(searchButton)).click();
        driver.findElement(By.xpath(seleniumHeader)).click();
        driver.getTitle().equals(seleniymTitle);
        System.out.println("Selenium finder finished his work.");
    }
}
