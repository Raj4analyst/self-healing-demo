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

WebUI.navigateToUrl('https://www.airbnb.com.au/')

WebUI.click(findTestObject('Object Repository/AIRBNB/Page_Holiday Homes  Condo Rentals - Airbnb _9c34c4/div_Anywhere'))

WebUI.setText(findTestObject('Object Repository/AIRBNB/Page_Holiday Homes  Condo Rentals - Airbnb _9c34c4/input_Where_query'), 
    'atlanta')

WebUI.click(findTestObject('Object Repository/AIRBNB/Page_Holiday Homes  Condo Rentals - Airbnb _9c34c4/div_Atlanta, GA'))

WebUI.click(findTestObject('Object Repository/AIRBNB/Page_Holiday Homes  Condo Rentals - Airbnb _9c34c4/div_3 days'))

WebUI.click(findTestObject('Object Repository/AIRBNB/Page_Holiday Homes  Condo Rentals - Airbnb _9c34c4/span_Add guests_t1dqvypu dir dir-ltr'))

WebUI.click(findTestObject('Object Repository/AIRBNB/Page_Airbnb  Atlanta  Holiday Rentals  Plac_ef63fb/span_Search resultsOver 1,000 places in Atlanta'))

WebUI.verifyTextPresent('places in Atlanta', false)


WebUI.closeBrowser()

