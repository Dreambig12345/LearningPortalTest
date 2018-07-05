import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8888/')

WebUI.click(findTestObject('Page_Spring Security Tutorial (1)/button_Go To Registration Page'))

WebUI.setText(findTestObject('Page_Registration Form/input_name'), 'Nithin')

WebUI.setText(findTestObject('Page_Registration Form/input_lastName'), 'S')

WebUI.setText(findTestObject('Page_Registration Form/input_email'), 'nitin@gmail.com')

WebUI.setText(findTestObject('Page_Registration Form/input_password'), 'May@2018')

WebUI.click(findTestObject('Page_Registration Form/button_Register User'))

WebUI.click(findTestObject('Page_Registration Form/button_Go To Login Page'))

WebUI.setText(findTestObject('Page_Spring Security Tutorial (1)/input_email'), 'nitin@gmail.com')

WebUI.setText(findTestObject('Page_Spring Security Tutorial (1)/input_password'), 'May@2018')

WebUI.click(findTestObject('Page_Spring Security Tutorial (1)/button_Login'))

WebUI.closeBrowser()
