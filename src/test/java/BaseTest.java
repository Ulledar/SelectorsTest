import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    String BASE_URL = "https://mvnrepository.com";
    WebDriver driver;

    @BeforeEach
    public void start() {
        //устанавливаем драйвер с помощью WebDriverManager
        WebDriverManager.chromedriver().setup();
        //инициализируем драйвер
        driver = new ChromeDriver();
        //делаем браузер во весь экран
        driver.manage().window().maximize();
        //указываем стартовую страницу
        driver.get(BASE_URL);
        System.out.println("Start");
    }

    @AfterEach
    public void finish() {
        //закрываем драйвер
        driver.quit();
        System.out.println("Finish");
    }
}
