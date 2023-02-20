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

WebUI.navigateToUrl('https://app.acceptance.nlziet.nl/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/a_Home'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/a_Tv  gids'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/a_Kijk later'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/a_Mijn series'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/p_Door op Alle cookies accepteren te klikke_bfe7ab'), 
    'Door op “Alle cookies accepteren” te klikken gaat u akkoord met het opslaan van cookies op uw apparaat voor het verbeteren van websitenavigatie, het analyseren van websitegebruik en om ons te helpen bij onze marketingprojecten.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/button_Cookie-instellingen'), 'Cookie-instellingen')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/button_Alle cookies accepteren'), 'Alle cookies accepteren')

WebUI.click(findTestObject('Object Repository/Page_NLZIET/button_Alle cookies accepteren'))

WebUI.scrollToElement(findTestObject('Page_NLZIET/h1_Nu op tv'), 0)

WebUI.scrollToElement(findTestObject('Page_NLZIET/h1_Meest bekeken'), 0)

WebUI.scrollToElement(findTestObject('Page_NLZIET/h1_Vooruitkijken NPO Plus'), 0)

WebUI.scrollToElement(findTestObject('Page_NLZIET/h1_Vooruitkijken'), 0)

WebUI.scrollToElement(findTestObject('Page_NLZIET/h1_Aanbevolen NPO Plus'), 0)

WebUI.scrollToElement(findTestObject('Page_NLZIET/h1_Aanbevolen'), 0)

WebUI.scrollToElement(findTestObject('Page_NLZIET/h1_Films NPO Plus'), 0)

