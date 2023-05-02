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
public class InformacijeTest {
	private Logger l = Logger.getLogger(InformacijeTest.class.getName());
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
  public void informacije() {
    driver.get("https://coral.rs/");
    driver.manage().window().setSize(new Dimension(1920, 1040));
    driver.findElement(By.cssSelector(".menu-sec span")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("testsajt1221@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("testsajt1221");
    driver.findElement(By.name("login")).click();
    driver.findElement(By.linkText("O nama")).click();
    
    WebElement txt = driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[2]/div[1]/div/div/h3[1]"));
    String oNama = txt.getText();
    WebElement txt2 = driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[2]/div[1]/div/div/p[1]"));
    String oNama2 = txt2.getText();
    WebElement txt3 = driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[2]/div[1]/div/div/h3[2]"));
    String oNama3 = txt3.getText();
    WebElement txt4 = driver.findElement(By.xpath("//*[@id=\"modernizrcom\"]/body/div[2]/div[1]/div/div/p[2]"));
    String oNama4 = txt4.getText();
    
    String string ="\nIme testa : Informacije o kompaniji \n"+
            "Opis testa: Test uzima podatke o kompaniji coral. \n"+
            oNama.toString() + "\n" +
            oNama2.toString() + "\n" +
            oNama3.toString() + "\n" +
            oNama4.toString() +
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
