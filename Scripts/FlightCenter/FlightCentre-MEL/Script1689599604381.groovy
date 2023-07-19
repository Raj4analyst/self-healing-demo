import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flightcentre.com.au/')

WebUI.waitForElementPresent(findTestObject('Object Repository/FlightCenter/Page_Cheap Flights, Hotels, Tours, Cruises _4636e9/img_Sitemap_ImagePopupBlockReadOnly__Intern_cee081'), 
    0)

WebUI.click(findTestObject('Object Repository/FlightCenter/Page_Cheap Flights, Hotels, Tours, Cruises _4636e9/path'))

WebUI.setText(findTestObject('Object Repository/FlightCenter/Page_Cheap Flights, Hotels, Tours, Cruises _4636e9/input__destination'), 
    'MEL')

WebUI.waitForElementPresent(findTestObject('Object Repository/FlightCenter/Page_Cheap Flights, Hotels, Tours, Cruises _4636e9/div_Kempegowda International AirportBangalo_4f8ebd'), 
    0)

WebUI.click(findTestObject('Object Repository/FlightCenter/Page_Cheap Flights, Hotels, Tours, Cruises _4636e9/div_Kempegowda International AirportBangalo_4f8ebd'))

WebUI.click(findTestObject('Object Repository/FlightCenter/Page_Cheap Flights, Hotels, Tours, Cruises _4636e9/button_Search flights'))

WebUI.switchToWindowTitle('Flight Centre Australia | Availability')

WebUI.waitForElementPresent(findTestObject('Object Repository/FlightCenter/Page_Flight Centre Australia  Availability/div_0945Fri21JulSYD1 Stop DELBLR0625Sat22Ju_2016cd'), 
    0)

WebUI.click(findTestObject('Object Repository/FlightCenter/Page_Flight Centre Australia  Availability/div_0945Fri21JulSYD1 Stop DELBLR0625Sat22Ju_2016cd'))

WebUI.click(findTestObject('Object Repository/FlightCenter/Page_Flight Centre Australia  Availability/span_SELECT'))

WebUI.closeBrowser()

