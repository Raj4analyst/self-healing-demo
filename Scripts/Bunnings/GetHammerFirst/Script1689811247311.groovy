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

WebUI.setText(findTestObject('Object Repository/Bunnings/Page_Australia DIY, Garden  Hardware Store _d788a5/input_Hire Shop_q'), 
    'hammer')

WebUI.click(findTestObject('Object Repository/Bunnings/Page_Australia DIY, Garden  Hardware Store _d788a5/rect'))

WebUI.verifyElementText(findTestObject('Object Repository/Bunnings/Page_Search results - Bunnings Australia/span_hammer'), 
    'hammer')

WebUI.click(findTestObject('Object Repository/Bunnings/Page_Search results - Bunnings Australia/article_CompareThor Hammer 650g Nylon Soft _13bfd0'))

WebUI.verifyElementText(findTestObject('Object Repository/Bunnings/Page_Thor Hammer 650g Nylon Soft Faced Hamm_1e135e/h1_Thor Hammer 650g Nylon Soft Faced Hammer TH712'), 
    'Thor Hammer 650g Nylon Soft Faced Hammer TH712')

