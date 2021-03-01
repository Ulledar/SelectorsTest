import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ByTest extends BaseTest{

    @Test
    public void finderWDM() {
        driver.findElement(By.id("query")).sendKeys("WebDriverManager");
        driver.findElement(By.className("button")).click();
        driver.findElement(By.linkText("WebDriverManager")).click();
        driver.findElement(By.linkText("4.3.1")).click();
        String dep = driver.findElement(By.id("maven-a")).getText();
        System.out.println(dep);
    }
}
