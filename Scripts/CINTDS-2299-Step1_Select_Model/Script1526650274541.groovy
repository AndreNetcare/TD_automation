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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://germany.int.publish.oneweb.mercedes-benz.cinteo.de/passengercars/mercedes-benz-cars/test-drive.html#/model')

WebUI.waitForPageLoad(15)

WebUI.delay(20)

WebUI.click(findTestObject('Oneweb_Elements/close_cookie_layer'))

WebUI.switchToFrame(findTestObject('Oneweb_Elements/td_contentframe'), 15)

WebUI.check(findTestObject('Step1_TestDrive_Model_Overview/step1_active'))

WebUI.check(findTestObject('Step2_TestDrive_Dealer_Locator/step2_active'))

WebUI.check(findTestObject('Step1_TestDrive_Model_Overview/step3_inactive'))

WebUI.check(findTestObject('Step1_TestDrive_Model_Overview/step4_inactive'))

WebUI.check(findTestObject('Step1_TestDrive_Model_Overview/footer_co2'))

WebUI.click(findTestObject('Step1_TestDrive_Model_Overview/modelsObjects_for_Model_Overview/modelOverview_C_class'))

WebUI.check(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_fueltype'))

WebUI.click(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/generic_next_step_button'))

WebUI.delay(15)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Step1_TestDrive_Model_Overview/change_step1_in_step2'))

WebUI.check(findTestObject('Step1_TestDrive_Model_Overview/step1_active'))

WebUI.closeBrowser()

