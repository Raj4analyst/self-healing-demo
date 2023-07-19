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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory


WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()
WebUI.delay(2)
//Get title
WebUI.getWindowTitle()

//Print WindowTitle

print(WebUI.getWindowTitle())
//Get URLof window
WebUI.getUrl()

WebUI.getWindowIndex(FailureHandling.CONTINUE_ON_FAILURE)

//get window index
int currentTab = WebUI.getWindowIndex()

//java script snippet- open a new window
WebDriver driver = DriverFactory.getWebDriver()
JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.open();')
WebUI.delay(3)

WebUI.switchToWindowIndex(currentTab+1, FailureHandling.CONTINUE_ON_FAILURE)

print(WebUI.getWindowIndex())


//Enter new URl for the new window

WebUI.navigateToUrl('https://www.wikipedia.org/')



//switch to window with differnt index = 0

WebUI.switchToWindowTitle('CURA Healthcare Service' )

//switch to new window with url
// get indiex
WebUI.switchToWindowUrl('https://www.wikipedia.org/')

WebUI.getWindowIndex()

String index = WebUI.getWindowIndex()

//Close window 

WebUI.closeWindowIndex(currentTab)

WebUI.delay(3)

WebUI.closeBrowser()



