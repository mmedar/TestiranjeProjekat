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
public class SearchTest {
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
  public void search() {
    driver.get("https://coral.rs/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.cssSelector(".fa-search:nth-child(2)")).click();
    driver.findElement(By.id("s")).click();
    driver.findElement(By.id("s")).sendKeys("DELL 23.8\", G2422HS");
    driver.findElement(By.cssSelector(".fa-search:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".attachment-medium")).click();
    
    assertEquals(driver.getCurrentUrl(),"https://coral.rs/product/dell-23-8-gaming-g2422hs/");
    
    WebElement naziv = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div/h1"));
    String proizvod = naziv.getText();
    assertEquals("DELL 23.8″ Gaming, G2422HS", proizvod);
    
    String string ="\nNaziv testa : Search test \n"+
            "Opis testa: Proverava pretragu proizvoda \n"+
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
