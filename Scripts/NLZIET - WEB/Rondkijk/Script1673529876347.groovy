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

WebUI.navigateToUrl('https://app.nlziet.nl/')

WebUI.click(findTestObject('Object Repository/Page_NLZIET/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET/a_Tv  gids'))

WebUI.click(findTestObject('Object Repository/NLZIET/Page_NLZIET  Tv  gids/a_Kijk later'))

WebUI.click(findTestObject('Object Repository/NLZIET/Page_NLZIET  Kijk later/a_Mijn series'))

WebUI.click(findTestObject('Object Repository/NLZIET/Page_NLZIET  Mijn series/a_Home'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Nu op tv'), 'Nu op tv')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Meest bekeken'), 'Meest bekeken')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Vooruitkijken NPO Plus'), 'Vooruitkijken NPO Plus')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Vooruitkijken'), 'Vooruitkijken')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Aanbevolen NPO Plus'), 'Aanbevolen NPO Plus')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Aanbevolen'), 'Aanbevolen')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Films NPO Plus'), 'Films NPO Plus')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Films'), 'Films')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Series NPO Plus'), 'Series NPO Plus')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Series'), 'Series')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/button_Alle cookies accepteren'), 'Alle cookies accepteren')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/button_Cookie-instellingen'), 'Cookie-instellingen')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/p_Door op Alle cookies accepteren te klikke_bfe7ab'), 
    'Door op “Alle cookies accepteren” te klikken gaat u akkoord met het opslaan van cookies op uw apparaat voor het verbeteren van websitenavigatie, het analyseren van websitegebruik en om ons te helpen bij onze marketingprojecten.')

WebUI.click(findTestObject('Object Repository/Page_NLZIET/button_Alle cookies accepteren'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/a_Algemene voorwaarden'), 'Algemene voorwaarden')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/a_Privacy  cookies'), 'Privacy & cookies')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/a_Hulp'), 'Hulp')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/a_Contact'), 'Contact')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/p_NLZIET. Alle rechten voorbehouden'), '© NLZIET. Alle rechten voorbehouden.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/a_Algemene voorwaarden'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/a_Privacy  cookies'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/a_Hulp'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/a_Contact'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET/svg_Mijn series_L71ZH'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/p_Log in om programmas te kijken'), 'Log in om programma\'s te kijken.')

