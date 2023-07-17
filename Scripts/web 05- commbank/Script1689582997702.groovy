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

WebUI.navigateToUrl('https://www.commbank.com.au/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Commbank/Page_CommBank - bank accounts, credit cards_f4c14e/h2_Tap into a simpler, more personal app ex_1c3895'), 
    3)

WebUI.waitForElementPresent(findTestObject('Commbank/Page_CommBank - bank accounts, credit cards_f4c14e/a_Banking'), 20)

WebUI.getText(findTestObject('Commbank/Page_CommBank - bank accounts, credit cards_f4c14e/a_Banking'))

WebUI.click(findTestObject('Object Repository/Commbank/Page_CommBank - bank accounts, credit cards_f4c14e/a_Banking'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Commbank/Page_Banking - CommBank/h1_Banking'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Commbank/Page_Banking - CommBank/h1_Banking'), 'Banking')

WebUI.click(findTestObject('Object Repository/Commbank/Page_Banking - CommBank/a_Home loans'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Commbank/Page_Home loans - calculators, guides and c_0e89e1/h1_Home loans'), 
    5)

WebUI.click(findTestObject('Object Repository/Commbank/Page_Home loans - calculators, guides and c_0e89e1/a_Book appointment'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Home Loan Appointment Booking')

WebUI.closeBrowser()

