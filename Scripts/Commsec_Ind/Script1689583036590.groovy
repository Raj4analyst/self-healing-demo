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

WebUI.waitForElementPresent(findTestObject('Object Repository/Commbank/Page_CommBank - bank accounts, credit cards_f4c14e/a_Bank  savings accounts'), 
    4)

WebUI.click(findTestObject('Object Repository/Commbank/Page_CommBank - bank accounts, credit cards_f4c14e/a_Bank  savings accounts'))

WebUI.click(findTestObject('Object Repository/Commbank/Page_Bank accounts - CommBank/a_See all everyday accounts'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Commbank/Page_Everyday accounts - CommBank/a_Open now'), 5)

WebUI.click(findTestObject('Object Repository/Commbank/Page_Everyday accounts - CommBank/a_Open now'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Commbank/Page_Everyday accounts - CommBank/a_Open now_1'), 
    5)

WebUI.click(findTestObject('Object Repository/Commbank/Page_Everyday accounts - CommBank/a_Open now_1'))

WebUI.switchToWindowTitle('Smart Access Application')

WebUI.waitForElementPresent(findTestObject('Object Repository/Commbank/Page_Smart Access Application/button_Get started'), 
    5)

WebUI.click(findTestObject('Object Repository/Commbank/Page_Smart Access Application/button_Get started'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Commbank/Page_Smart Access Application/h2_Just me'), 4)

WebUI.click(findTestObject('Object Repository/Commbank/Page_Smart Access Application/h2_Just me'))

WebUI.click(findTestObject('Object Repository/Commbank/Page_Smart Access Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Commbank/Page_Smart Access Application/button_No'))

WebUI.click(findTestObject('Object Repository/Commbank/Page_Smart Access Application/button_Open Smart Access only'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Commbank/Page_Smart Access Application/select_Please selectMrMsMrsMiss'), 
    'Ms', true)

WebUI.setText(findTestObject('Object Repository/Commbank/Page_Smart Access Application/input_First name_firstName'), 'test')

WebUI.setText(findTestObject('Object Repository/Commbank/Page_Smart Access Application/input_Middle name(s) - if you have one_middleName'), 
    'middletest')

WebUI.setText(findTestObject('Object Repository/Commbank/Page_Smart Access Application/input_Last name_lastName'), 'lasttes')

WebUI.click(findTestObject('Object Repository/Commbank/Page_Smart Access Application/button_Next_1'))

WebUI.setText(findTestObject('Object Repository/Commbank/Page_Smart Access Application/input_Australian mobile number_mobileNumber'), 
    '0445545445')

WebUI.setText(findTestObject('Object Repository/Commbank/Page_Smart Access Application/input_Email address_emailAddress'), 
    'test@test.com')

WebUI.click(findTestObject('Object Repository/Commbank/Page_Smart Access Application/button_Next_1_2'))

WebUI.closeBrowser()

