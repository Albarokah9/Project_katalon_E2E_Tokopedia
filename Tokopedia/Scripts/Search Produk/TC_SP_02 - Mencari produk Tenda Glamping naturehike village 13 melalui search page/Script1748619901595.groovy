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

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.click(findTestObject('Register/WelcomePage/svg'))

WebUI.setText(findTestObject('Search/searchPage/input_Kategori_css-6v0gm9 exxxdg63'), 'Tenda Glamping naturehike village 13')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Search/searchPage/input_Kategori_css-6v0gm9 exxxdg63'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Search/Tenda Glamping naturehike village 13/img_Urutkan_Q6EyY3lHkLBxLWawflt9Sg NWVIhquIvF0Jc0Qlizjluw'))

WebUI.verifyElementPresent(findTestObject('Search/assertTenda/h1_TENDA VILLAGE 13  GLAMPING  TENDA OTOMATIS NATUREHIKE CNH22ZP004'), 
    3)

WebUI.verifyTextPresent('TENDA VILLAGE 13 / GLAMPING / TENDA OTOMATIS NATUREHIKE CNH22ZP004', false)

