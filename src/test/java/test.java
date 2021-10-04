import org.apache.maven.surefire.shade.booter.org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    private static final WebDriver driver = new ChromeDriver();

    @Test

    public void successfulDriverTest() {
        driver.get("http://zero.webappsecurity.com/index.html");
        driver.quit();
    }
}

