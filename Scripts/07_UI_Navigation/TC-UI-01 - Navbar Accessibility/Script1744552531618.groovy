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

WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/a_Contact'))

WebUI.verifyElementPresent(findTestObject('Object Repository/UI/Page_STORE/div_New message'), 0)

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/span_'))

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/a_About us'))

WebUI.verifyElementPresent(findTestObject('Object Repository/UI/Page_STORE/div_About us'), 0)

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/span__1'))

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/a_Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/UI/Page_STORE/h2_Products'), 0)

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/a_Log in'))

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/div_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/UI/Page_STORE/div_Log in'), 0)

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/span__1_2'))

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/a_Sign up'))

WebUI.verifyElementPresent(findTestObject('Object Repository/UI/Page_STORE/div_Sign up'), 0)

WebUI.click(findTestObject('Object Repository/UI/Page_STORE/span__1_2_3'))

