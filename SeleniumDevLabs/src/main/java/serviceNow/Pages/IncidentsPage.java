package serviceNow.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import serviceNow.CommonUtilities.BaseSeleniumClass;

public class IncidentsPage extends BaseSeleniumClass{

	private String incidentNumberValue;
	public IncidentsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='New']")
	private WebElement newButton;
	@FindBy(id="incident.number")
	private WebElement incidentNumber;
	@FindBy(id="incident.short_description")
	private WebElement shortDescription;
	@FindBy(xpath="(//button[@value='sysverb_insert'])[1]")
	private WebElement submittIncident;
	@FindBy(xpath="//div[text()='Save']")
	private WebElement saveIncident;
	@FindBy(xpath="//span[text()='Press Enter from within the input to submit the search.']//following-sibling::input")
	private WebElement incidentSearchBox;
	@FindBy(id="incident_table")
	private WebElement incidentsTable;
	@FindBy(xpath="(//button[text()='Update'])[1]")
	private WebElement updateButton;
	@FindBy(xpath="//table[@id='incident_table']/tbody/tr[1]/td[3]/a")
	private WebElement searchedIncidentNumber;
	public IncidentsPage pageLoad() {
		driver.switchTo().frame("gsft_main");
		waitFor(newButton, "VisibilityOf");
		driver.switchTo().defaultContent();
		return this;
	}
	
	public IncidentsPage newIncident() {
		newButton.click();
		return this;
	}
	public IncidentsPage validateIncidentNumber() {
		waitFor(incidentNumber, "VisibilityOf");
		this.incidentNumberValue= incidentNumber.getAttribute("value");
		/*if(incidentNumberValue.startsWith("INC"))
			System.out.println("TC PASSED");
		else
			System.err.println("TC FAILED");*/
		softAssert.assertTrue(incidentNumberValue.startsWith("INC"),"Incident Number Validation");
		return this;
	}
	public IncidentsPage validateSearchBox() {
		waitFor(incidentSearchBox, "VisibilityOf");
		String value = incidentSearchBox.getAttribute("placeholder");
		softAssert.assertEquals(value, "Search");
		/*if(value.equals("Search"))
			System.out.println("TC PASSED");
		else
			System.err.println("TC FAILED");*/
		return this;
	}
	public IncidentsPage validateNewIncident(String shortDescription) {
		try {
			pageLoad();
			driver.switchTo().frame("gsft_main");
			validateSearchBox();
			newIncident();
			validateIncidentNumber();
			this.shortDescription.sendKeys(shortDescription);
			advancedUIActions(submittIncident, "rightclick");
			waitFor(saveIncident, "VisibilityOf");
			saveIncident.click();
			waitFor(updateButton, "VisibilityOf");
			updateButton.click();
			waitFor(incidentSearchBox, "VisibilityOf");
			incidentSearchBox.sendKeys(incidentNumberValue,Keys.ENTER);
			////table[@id='incident_table']/thead/tr[1]/th[3]/span/a
			waitFor(searchedIncidentNumber, "VisibilityOfText", this.incidentNumberValue);
			softAssert.assertEquals(searchedIncidentNumber.getText(), this.incidentNumberValue);
			driver.switchTo().defaultContent();

		}
		catch(Exception ex) {
			System.out.println(ex);
		}
				return this;
	}
	
	public void incidentsValidation(String shortDescription) {
		validateNewIncident(shortDescription);
		softAssert.assertAll();
	}
}
