package petstorepageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Accountinformationpagetest{ 
@Test

public void Registration() {
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//Newchromedriver.exe");
WebDriver driver = new ChromeDriver();
Accountinformationpage AIP = new  Accountinformationpage(driver);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
AIP.setUser("Lakshmi");
AIP.setpassword("laks");
AIP.setrepeatpassword("laks");

//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;


AIP.setfirstname("Lakshmi");
AIP.setlastname("Meduri");
AIP.setemail("medurirupa@gmail.com");
AIP.setphone("7036553572");

AIP.setaddress1("23001");
AIP.setaddress2("Bulwark terrace");

AIP.setcity("Brambleton");
AIP.setstate("Virginia");

AIP.setzip("20148");
AIP.setcountry("usa");
AIP.clicksaveaccountinformation();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
}