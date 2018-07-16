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

scale_default = WebUI.getText(findTestObject('Step2_TestDrive_Dealer_Locator/dl-scale_text'))

scale_default.replaceAll(' km', '')

int scale_default_number = Integer.parseInt(scale_default)

WebUI.click(findTestObject('Step2_TestDrive_Dealer_Locator/dl-map_zoom_in'))

scale_zoom_in = WebUI.getText(findTestObject('Step2_TestDrive_Dealer_Locator/dl-scale_text'))

scale_zoom_in.replaceAll(' km', '')

int scale_zoom_in_number = Integer.parseInt(scale_zoom_in)

if (scale_zoom_in_number > scale_default_number) {
    throw new com.kms.katalon.core.exception.StepFailedException()
}

WebUI.click(findTestObject('Step2_TestDrive_Dealer_Locator/dl-map_zoom_out'))

scale_zoom_out = WebUI.getText(findTestObject('Step2_TestDrive_Dealer_Locator/dl-scale_text'))

scale_zoom_out.replaceAll(' km', '')

int scale_zoom_out_number = Integer.parseInt(scale_zoom_in)

if (scale_zoom_out_number < scale_zoom_in_number) {
	throw new com.kms.katalon.core.exception.StepFailedException() 
	}