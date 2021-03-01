import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CSSTest extends BaseTest {
    String searchField = "input#query";
    String searchButton = "input.button";
    String headerJUnit = "h2 a[href$='junit-jupiter-api']";
    //String choseVersion = "a.vbtn.milestone";
    String choseVersion = "a[href='junit-jupiter-api/5.8.0-M1']";
    String copyField = "textarea.snippet";

    @Test
    public void findJUnit() {
        driver.findElement(By.cssSelector(searchField)).sendKeys("JUnit");
        driver.findElement(By.cssSelector(searchButton)).click();
        driver.findElement(By.cssSelector(headerJUnit)).click();
        driver.findElement(By.cssSelector(choseVersion)).click();
        String depCode = driver.findElement((By.cssSelector(copyField))).getText();
        System.out.println(depCode);

    }
}
