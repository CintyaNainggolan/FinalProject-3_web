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

WebUI.navigateToUrl('https://www.jakmall.com/')

WebUI.click(findTestObject('Object Repository/jakmall.com/Page_Jakmall.com Pusat Dropship Modal Kecil_c30580/button_Batal'))

WebUI.click(findTestObject('Object Repository/jakmall.com/Page_Jakmall.com Pusat Dropship Modal Kecil_c30580/b_Login'))

CustomKeywords.'helper.Login.login'()

def testData = findTestData('Data Files/excelData')

def categoryName = testData.getObjectValue('categoryName', 3)

WebUI.click(findTestObject('Object Repository/Kategori', [('categoryName') : categoryName]))

WebUI.click(findTestObject('Object Repository/jakmall.com/Page_Jual Komputer  Laptop  Jakmall.com/a_TaffSTUDIO Splitter Audio U Shape 3.5mm ke Headphone dan Mic - K0650'))

WebUI.click(findTestObject('Object Repository/jakmall.com/Page_Jual OTOHEROES Smartphone Car Holder Adjustable with Suction Cup/span_Tambah ke Keranjang'))

WebUI.click(findTestObject('Object Repository/jakmall.com/Page_Jual OTOHEROES Smartphone Car Holder Adjustable with Suction Cup/div_Lihat keranjang'))

