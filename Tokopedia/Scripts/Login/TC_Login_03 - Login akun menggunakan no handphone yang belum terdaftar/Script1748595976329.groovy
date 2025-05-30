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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://tokopedia.com/')

WebUI.click(findTestObject('Register/WelcomePage/svg'))

WebUI.click(findTestObject('Login/Masuk/button_Masuk'))

WebUI.setText(findTestObject('Login/fieldNoHandphone_Email/input_Nomor HP atau Email_email-phone'), '08995324319')

WebUI.click(findTestObject('Login/selanjutnya/button_Selanjutnya'))

WebUI.verifyElementPresent(findTestObject('Login/noHandphoneBelumTerdaftar/div_Nomor HP belum terdaftarLanjut daftar dengan nomor HP ini  08995324319Ya, DaftarUbah'), 
    5)

WebUI.verifyTextPresent('Nomor HP belum terdaftar', false)

