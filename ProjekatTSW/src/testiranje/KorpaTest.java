// Generated by Selenium IDE
package testiranje;

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
import java.util.logging.Logger;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
public class KorpaTest {
	private Logger l = Logger.getLogger(KorpaTest.class.getName());
	private String exePath="C:\\Users\\mjedor\\Desktop\\chromedriver_win32\\chromedriver.exe";
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", exePath);
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void korpa() throws InterruptedException {
    driver.get("https://coral.rs/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.cssSelector(".menu-sec span")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("testsajt1221@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("testsajt1221");
    driver.findElement(By.name("login")).click();
    driver.findElement(By.linkText("Coral Computers")).click();
    driver.findElement(By.linkText("Računari")).click();
    driver.findElement(By.cssSelector("#\\36 1128 .attachment-medium")).click();
    driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();
    driver.findElement(By.linkText("Coral Computers")).click();
    driver.findElement(By.linkText("Štampači i skeneri")).click();
    driver.findElement(By.cssSelector("#\\35 9920 .attachment-medium")).click();
    driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();
    driver.findElement(By.linkText("Coral Computers")).click();
    driver.findElement(By.linkText("Monitori")).click();
    driver.findElement(By.cssSelector("#\\36 8252 .attachment-medium")).click();
    driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();
    driver.findElement(By.cssSelector(".wc-forward")).click();
    Thread.sleep(4000);
    assertEquals(driver.getCurrentUrl(),"https://coral.rs/korpa/");
    
    String string ="\nNaziv testa : Korpa test \n"+
            "Opis testa: Dodavanje proizvoda u korpu\n"+
  "\nTest je uspesan \n\n";
    l.info(string.toString());
    
	 try {
	 	FileWriter fw = new FileWriter("C:\\Users\\mjedor\\Desktop\\CoralTesting\\test-report.txt", true);
	 	fw.write(string.toString());
	 	fw.flush();
	 	fw.close();
	 }catch (Exception e) {
	 	System.out.println(e.getMessage());
	 }

  }
}