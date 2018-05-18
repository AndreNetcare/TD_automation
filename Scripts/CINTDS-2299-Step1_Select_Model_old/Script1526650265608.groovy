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

WebUI.navigateToUrl('https://germany.int.publish.oneweb.mercedes-benz.cinteo.de/passengercars/mercedes-benz-cars/test-drive.html#/model')

WebUI.click(findTestObject('Page_TestDrive_Model_Overview/close_cookie_layer'))

WebUI.check(findTestObject('Page_Daimler - Probefahrt - Mercede/div_1                  Modell'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Modell auswhlen'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Hndler auswhlen'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Auswahl besttigen'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Zusammenfassung'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/img_tdb-vehicle-model-tile-img'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Kraftstoff Typ'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/button_Weiter'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_ndern'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/use'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/img_tdb-vehicle-model-tile-img_1'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/img_tdb-vehicle-model-tile-img_2'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/svg_tdb-icon'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/img_tdb-vehicle-model-tile-img'))

WebUI.click(findTestObject('Page_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_fueltype'))

WebUI.click(findTestObject(null))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_Motorisierung'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_C 350 e Limousine'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/button_Getriebe'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/li_Automatik'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Getriebe Automatik'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/button_Hybrid'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/li_Benzin'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_Motorisierung'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/li_C 180 Limousine'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Kraftstoffverbrauch innero'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Kraftstoffverbrauch innero_1'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/button_Getriebe'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_B'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_Getriebe'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/li_Schaltgetriebe'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Getriebe Schaltgetriebe'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_Schaltgetriebe'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Getriebe Schaltgetriebe'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Kraftstoffverbrauch innero_1'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_B'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_Schaltgetriebe'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/li_Automatik'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Getriebe Automatik'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/div_Kraftstoffverbrauch innero'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/span_B'))

WebUI.click(findTestObject('Page_Daimler - Probefahrt - Mercede/button_Weiter'))

WebUI.closeBrowser()

