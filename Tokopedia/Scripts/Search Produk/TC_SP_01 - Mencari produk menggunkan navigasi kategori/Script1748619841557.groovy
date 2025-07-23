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

WebUI.click(findTestObject('Search/category/a_Kategori'))

WebUI.click(findTestObject('Search/pageCategory/a_Baterai  Charger Kamera'))

WebUI.click(findTestObject('Search/KameraDigital/img_Kamera Digital_css-1ckwll6'))

WebUI.click(findTestObject('Search/actionCamera/span_Action Camera'))

WebUI.click(findTestObject('Search/Page_Potret dan Rekam Aksimu dengan Action Camera - Tokopedia - Harga Terbaik  Tokopedia/img_Tambah ke Wishlist_success fade'))

WebUI.verifyElementPresent(findTestObject('Search/AssertionDJI_Osmo/h1_DJI Pocket 3 Creator Combo Garansi TAM Official 1 Tahun Resmi Osmo Pocket 3 - Creator Combo - Extreme Pro 512'), 
    5)

WebUI.verifyTextPresent('DJI Pocket 3 Creator Combo Garansi TAM Official 1 Tahun Resmi Osmo Pocket 3 - Creator Combo - Extreme Pro 512', 
    false)

