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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import internal.GlobalVariable as GlobalVariable
import java.util.Random as Random

Random rand = new Random()

int n

int k

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://germany.int.publish.oneweb.mercedes-benz.cinteo.de/passengercars/mercedes-benz-cars/test-drive.html#/model')

WebUI.waitForPageLoad(15)

WebUI.delay(5)

'Deactivated because no cookie layer available'
WebUI.click(findTestObject('Oneweb_Elements/close_cookie_layer'))

WebUI.refresh()

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Oneweb_Elements/Header_MB_logo'))

WebUI.verifyElementVisible(findTestObject('Oneweb_Elements/Footer_Links'))

'Switch to test drive iframe'
WebUI.switchToFrame(findTestObject('Oneweb_Elements/td_contentframe'), 15)

'Step 1'
WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/step1_active'))

WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/step2_inactive'))

WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/step3_inactive'))

WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/step4_inactive'))

WebUI.scrollToElement(findTestObject('Step1_TestDrive_Model_Overview/footer_co2'), 0)

WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/footer_co2'))

WebUI.scrollToElement(findTestObject('Step1_TestDrive_Model_Overview/modelsObjects_for_Model_Overview/modelOverview_CLS_coupe'), 
    0)

WebUI.click(findTestObject('Step1_TestDrive_Model_Overview/modelsObjects_for_Model_Overview/modelOverview_CLS_coupe'))

WebUI.click(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_fueltype'))

WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_motor_disabled'))

WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_transmission_disabled'))

WebUI.click(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/dropdown_fueltype_select_byIndex', [('index') : 1]))

WebUI.verifyElementNotPresent(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_motor_disabled'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/generic_dropdown_motor_disabled'), 
    0)

WebUI.click(findTestObject('Step1_TestDrive_Model_Overview/model_layer_objects/generic_next_step_button'))

'Step 2'
WebUI.verifyElementVisible(findTestObject('Step2_TestDrive_Dealer_Locator/step2_active'))

WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/step3_inactive'))

WebUI.verifyElementVisible(findTestObject('Step1_TestDrive_Model_Overview/step4_inactive'))

WebUI.verifyElementVisible(findTestObject('Step2_TestDrive_Dealer_Locator/dl-main_map'))

WebUI.verifyElementVisible(findTestObject('Step2_TestDrive_Dealer_Locator/dl-searchform'))

WebUI.setText(findTestObject('Step2_TestDrive_Dealer_Locator/dl-form_postcode'), '71034')

WebUI.click(findTestObject('Step2_TestDrive_Dealer_Locator/dl-form_submit'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Step2_TestDrive_Dealer_Locator/dl-resultspanel'))

WebUI.click(findTestObject('Step2_TestDrive_Dealer_Locator/dl-generic_select_first_dealer_result'))

WebUI.delay(5)

'Step 3'
WebUI.verifyElementVisibleInViewport(findTestObject('Step3_TestDrive_select_Date/step3_active'), 0)

WebUI.verifyElementVisibleInViewport(findTestObject('Step1_TestDrive_Model_Overview/step4_inactive'), 0)

n = (rand.nextInt(21) + 1)

WebUI.scrollToElement(findTestObject('Step3_TestDrive_select_Date/generic_calendar_day_available_byIndex', [('index') : n]), 
    0)

WebUI.click(findTestObject('Step3_TestDrive_select_Date/generic_calendar_day_available_byIndex', [('index') : n]))

String date = WebUI.getText(findTestObject('Step3_TestDrive_select_Date/generic_calendar_day_available_byIndex', [('index') : n]))

WebUI.getText(findTestObject('Step3_TestDrive_select_Date/generic_calendar_day_selected')).equals(date)

WebUI.verifyElementVisible(findTestObject('Step3_TestDrive_select_Date/best_match'))

WebUI.scrollToElement(findTestObject('Step3_TestDrive_select_Date/generic_vehicle_select_byIndex', [('index') : 1]), 0)

WebUI.click(findTestObject('Step3_TestDrive_select_Date/generic_vehicle_select_byIndex', [('index') : 1]))

WebUI.verifyElementVisible(findTestObject('Step3_TestDrive_select_Date/generic_vehicle_selected_byIndex', [('index') : 1]))

k = (rand.nextInt(DriverFactory.getWebDriver().findElements(By.xpath('(//div[@class=\'tdb-timepicker-cell\'])')).size()) + 
1)

WebUI.click(findTestObject('Step3_TestDrive_select_Date/generic_timepicker_cell_byIndex', [('index') : k]))

String time = WebUI.getText(findTestObject('Step3_TestDrive_select_Date/generic_timepicker_cell_byIndex', [('index') : k]))

WebUI.getText(findTestObject('Step3_TestDrive_select_Date/generic_timepicker_cell_selected')).equals(time)

WebUI.click(findTestObject('Step3_TestDrive_select_Date/main_contact_form/salutation', [('salut') : 'MS']))

WebUI.setText(findTestObject('Step3_TestDrive_select_Date/main_contact_form/firstname'), 'netcare')

WebUI.setText(findTestObject('Step3_TestDrive_select_Date/main_contact_form/lastname'), 'tester')

WebUI.setText(findTestObject('Step3_TestDrive_select_Date/main_contact_form/street'), 'Lichtaecker 1')

WebUI.setText(findTestObject('Step3_TestDrive_select_Date/main_contact_form/city'), 'Neustetten')

WebUI.setText(findTestObject('Step3_TestDrive_select_Date/main_contact_form/postcode'), '72049')

WebUI.verifyElementVisible(findTestObject('Step3_TestDrive_select_Date/continue_button_disabled'))

WebUI.setText(findTestObject('Step3_TestDrive_select_Date/main_contact_form/email'), 'karim.ayed@netcare.de')

WebUI.setText(findTestObject('Step3_TestDrive_select_Date/main_contact_form/phone'), '012345678')

WebUI.click(findTestObject('Step3_TestDrive_select_Date/continue_button_enabled', [('index') : n]))

WebUI.verifyElementVisible(findTestObject('Step4_TestDrive_Summary/step4_active'))

WebUI.verifyElementVisible(findTestObject('Step4_TestDrive_Summary/vehicleCard'))

WebUI.verifyElementVisible(findTestObject('Step4_TestDrive_Summary/vehicleCard_legal_Information'))

WebUI.verifyElementVisible(findTestObject('Step4_TestDrive_Summary/dealerTile'))

WebUI.verifyElementVisible(findTestObject('Step4_TestDrive_Summary/detailsTile'))

WebUI.verifyElementVisible(findTestObject('Step4_TestDrive_Summary/confirm_TestDrive_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Step4_TestDrive_Summary/confirm_TestDrive_button'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementVisible(findTestObject('Summary/vehicleCard'))

WebUI.verifyElementVisible(findTestObject('Summary/vehicleCard_legal_Information'))

WebUI.verifyElementVisible(findTestObject('Summary/dealerTile'))

WebUI.verifyElementVisible(findTestObject('Summary/detailsTile'))

WebUI.verifyElementText(findTestObject('Summary/main_contact_form/firstname'), 'netcare')

WebUI.verifyElementText(findTestObject('Summary/main_contact_form/lastname'), 'tester')

WebUI.verifyElementText(findTestObject('Summary/main_contact_form/street'), 'Lichtaecker 1')

WebUI.verifyElementText(findTestObject('Summary/main_contact_form/postcode'), '72049')

WebUI.verifyElementText(findTestObject('Summary/main_contact_form/city'), 'Neustetten')

WebUI.verifyElementText(findTestObject('Summary/main_contact_form/email'), 'karim.ayed@netcare.de')

WebUI.verifyElementText(findTestObject('Summary/main_contact_form/phone'), '+49 12345678')

WebUI.closeBrowser()

