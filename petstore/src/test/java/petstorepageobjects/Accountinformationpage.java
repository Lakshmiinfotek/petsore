package petstorepageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountinformationpage {
WebDriver driver;//globally initilized driver.
Accountinformationpage(WebDriver Rdriver){
	this.driver=Rdriver;
	PageFactory.initElements(Rdriver,this);
		// the parameter driver is looking for elements
	}
@FindBy(name="username")
WebElement UserID;

@FindBy(name="password")
WebElement NewPassword;

@FindBy(name ="repeatedPassword")
WebElement RepeatPassword;

@FindBy(name ="account.firstname")
WebElement Firstname;

@FindBy(name = "account.lastName")
WebElement Lastname;

@FindBy(name="account.email")
WebElement Email;

@FindBy(name="account.phone")
WebElement Phone;

@FindBy(name="account.address1")
WebElement Address1;

@FindBy(name="account.address2")
WebElement Address2;

@FindBy(name="account.city")
WebElement City;

@FindBy(name="account.state")
WebElement State;

@FindBy(name="account.zip")
WebElement Zip;

@FindBy(name="account.countryy")
WebElement Country;
@FindBy(name="newAccount")
WebElement saveaccountinformation;

//methods for webElements
		public void setUser(String userid) 
		{
			UserID.sendKeys(userid);
		}

		public void setpassword(String newPassword)
		{
			//NewPassword.sendKeys(newPassword);
		}

		public void setrepeatpassword(String repeatedpassword) 
		{
			RepeatPassword.sendKeys(repeatedpassword);		
		}

		public void setfirstname(String firstname)
		{
			Firstname.sendKeys(firstname);

		}

		public void setlastname(String lastname)
		{
			Lastname.sendKeys(lastname);
			
		}
		public void setemail(String email)
		{
			Email.sendKeys(email);
		}
		public void setphone(String phnumber)
		{
			Phone.sendKeys(phnumber);
			
		}
		public void setaddress1(String Ad1)
		{
			Address1.sendKeys(Ad1);
			
		}
		public void setaddress2(String Ad2)
		{
			Address2.sendKeys(Ad2);
			
		}
		public void setcity(String cty)
		{
			City.sendKeys(cty);
						
		}
		public void setstate(String st)
		{
			State.sendKeys(st);
						
		}
		public void setzip(String zp)
		{
			Zip.sendKeys(zp);
						
		}
		public void setcountry(String ctry)
		{
			Country.sendKeys(ctry);
						
		}
		
		public void clicksaveaccountinformation()
		
		{
			saveaccountinformation.click();
						
		}

		
			
		}


