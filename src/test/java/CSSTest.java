import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CSSTest extends BaseTest {
    String searchField = "input#query"; //айди "квери" во вкладке инпут
    String searchButton = "input.button"; //класс "батон" во вкладке "инпут"
    String headerJUnit = "h2 a[href$='junit-jupiter-api']"; //ссылка заканчивается на "junit-jupiter-api" во вкладке "а" в "аш2"
    //String choseVersion = "a.vbtn.milestone"; //класс "vbtn milestone" во складке "а"
    String choseVersion = "a[href='junit-jupiter-api/5.8.0-M1']"; //ссылка "junit-jupiter-api/5.8.0-M1" во вкладке "а"
    String copyField = "textarea.snippet"; //класс "сниппет" во складке "текстареа"

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
