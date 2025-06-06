// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Ejercicio1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void ejercicio1() {
    driver.get("https://www.w3schools.com//html/html_forms.asp");
    driver.manage().window().setSize(new Dimension(1112, 665));
    js.executeScript("window.scrollTo(0,211.1999969482422)");
    driver.findElement(By.id("fname")).click();
    driver.findElement(By.id("fname")).click();
    driver.findElement(By.id("fname")).sendKeys("David");
    driver.findElement(By.id("lname")).sendKeys("Torres");
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector("input:nth-child(10)")).click();
    vars.put("win2525", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2525").toString());
    assertThat(driver.findElement(By.cssSelector("p:nth-child(6)")).getText(), is("The server has processed your input and returned this answer."));
  }
}
