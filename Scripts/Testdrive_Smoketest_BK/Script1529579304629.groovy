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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://germany.int.publish.oneweb.mercedes-benz.cinteo.de/passengercars/mercedes-benz-cars/test-drive.html#/model')

WebUI.waitForPageLoad(15)

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Page_TestDrive_Model_Overview/close_cookie_layer'))

WebUI.verifyElementVisible(findTestObject('Oneweb_Elements/Header_MB_logo'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Oneweb_Elements/Footer_Links'))

WebUI.switchToFrame(findTestObject('Page_TestDrive_Model_Overview/td_contentframe'), 15)

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/step1_active'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/step2_inactive'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/step3_inactive'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/step4_inactive'))

WebUI.scrollToElement(findTestObject('Page_TestDrive_Model_Overview/footer_co2'), 0)

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/footer_co2'))

WebUI.scrollToElement(findTestObject('Page_TestDrive_Model_Overview/modelsObjects_for_Model_Overview/modelOverview_CLS_coupe'), 
    0)

WebUI.click(findTestObject('Page_TestDrive_Model_Overview/modelsObjects_for_Model_Overview/modelOverview_CLS_coupe'))

WebUI.click(findTestObject('Page_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_fueltype'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_motor_disabled'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_transmission_disabled'))

WebUI.click(findTestObject('Page_TestDrive_Model_Overview/model_layer_objects/dropdown_fueltype_select_byIndex_benzin'))

WebUI.verifyElementNotPresent(findTestObject('Page_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_motor_disabled'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Page_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_motor_disabled'), 
    0)

WebUI.click(findTestObject('Page_TestDrive_Model_Overview/model_layer_objects/generic_next_step_button'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Dealer_Locator/step2_active'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/step3_inactive'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Model_Overview/step4_inactive'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Dealer_Locator/dl-main_map'))

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Dealer_Locator/dl-searchform'))

WebUI.setText(findTestObject('Page_TestDrive_Dealer_Locator/dl-form_postcode'), '23554')

WebUI.click(findTestObject('Page_TestDrive_Dealer_Locator/dl-form_submit'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Page_TestDrive_Dealer_Locator/dl-resultspanel'))

WebUI.click(findTestObject('Page_TestDrive_Dealer_Locator/dl-generic_select_first_dealer_result'))

