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

WebUI.callTestCase(findTestCase('04_Cart/TC-CART-01 - Add Product to Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/checkout/Page_STORE/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/checkout/Page_STORE/Page_STORE/input_Name_name'), 'dd')

WebUI.setText(findTestObject('Object Repository/checkout/Page_STORE/Page_STORE/input_City_city'), 'dd')

WebUI.click(findTestObject('Object Repository/checkout/Page_STORE/Page_STORE/button_Purchase'))

WebUI.waitForAlert(2)

String txt = WebUI.getAlertText()

WebUI.verifyMatch(txt, 'Please fill out Name and Creditcard.', false)

WebUI.acceptAlert()


