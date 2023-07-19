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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.verifyElementText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/h3_We Care About Your Health'), 
    'We Care About Your Health')



WebUI.verifyElementText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/a_Make Appointment'), 
    'Make Appointment')

WebUI.verifyElementText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2023'), 
    'Copyright © CURA Healthcare Service 2023')

WebUI.click(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/a_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/p_Please login to make appointment'), 
    'Please login to make appointment.')

WebUI.verifyElementText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/input_Demo account_form-control'), 
    '')
//get attribute from webelement and pass it to another element
attribute = WebUI.getAttribute(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/input_Demo account_form-control'), 'value')


//attribute = WebUI.getAttribute(findTestObject('Page_CuraHomepage/btn_MakeAppointment'), 'class')

//'Verify if \'class\' attribute value is correct for the button.'
//WebUI.verifyMatch(attribute, 'btn btn-dark btn-lg', false)

WebUI.verifyElementText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/input_Demo account_form-control_1'), 
    '')

//WebUI.get

//WebUI.setText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/input_Username_username'), userName)

WebUI.setText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/input_Username_username'),attribute)

WebUI.setEncryptedText(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/CuraHealthRecorded/Page_CURA Healthcare Service/button_Login'))

