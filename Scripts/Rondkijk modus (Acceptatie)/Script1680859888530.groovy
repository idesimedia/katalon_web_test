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

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/div_Door op Alle cookies accepteren te klik_f2ec63'), 
    'Door op “Alle cookies accepteren” te klikken gaat u akkoord met het opslaan van cookies op uw apparaat voor het verbeteren van websitenavigatie, het analyseren van websitegebruik en om ons te helpen bij onze marketingprojecten.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/button_Cookie-instellingen'), 'Cookie-instellingen')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/button_Alle cookies accepteren'), 'Alle cookies accepteren')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/button_Cookie-instellingen'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_NLZIET/button_Alle cookies accepteren'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/div_Door op Alle cookies accepteren te klik_f2ec63'), 
    'Door op “Alle cookies accepteren” te klikken gaat u akkoord met het opslaan van cookies op uw apparaat voor het verbeteren van websitenavigatie, het analyseren van websitegebruik en om ons te helpen bij onze marketingprojecten.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/button_Cookie-instellingen'), 'Cookie-instellingen')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/button_Alle cookies accepteren'), 'Alle cookies accepteren')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/button_Cookie-instellingen'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_NLZIET/button_Alle cookies accepteren'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET/button_Alle cookies accepteren'))

'\'Zoeken\' icoon rechtsboven'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/Zoeken icoon'), 0)

'\'Account\' icoon rechtsboven'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/Account icoon'), 0)

'\'NPO Plus\' deelnemer button'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/NPO Plus deelnemer button'), 0)

'\'RTL\' deelnemer button'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/RTL deelnemer button'), 0)

'\'KIJK\' deelnemer button'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/KIJK deelnemer button'), 0)

'\'REGIO\' deelnemer button'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/REGIO deelnemer button'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Nu op tv'), 'Nu op tv')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Meest bekeken'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Meest bekeken'), 'Meest bekeken')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Vooruitkijken NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Vooruitkijken NPO Plus'), 'Vooruitkijken NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Vooruitkijken'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Vooruitkijken'), 'Vooruitkijken')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Aanbevolen NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Aanbevolen NPO Plus'), 'Aanbevolen NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Aanbevolen'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Aanbevolen'), 'Aanbevolen')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Films NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Films NPO Plus'), 'Films NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Films'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Films'), 'Films')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Series NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Series NPO Plus'), 'Series NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Series'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/h1_Series'), 'Series')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/a_Algemene voorwaarden'), 'Algemene voorwaarden')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/a_Privacy  cookies'), 'Privacy & cookies')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/a_Hulp'), 'Hulp')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/a_Contact'), 'Contact')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/p_NLZIET. Alle rechten voorbehouden'), '© NLZIET. Alle rechten voorbehouden.')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/h1_Nu op tv'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/Meest bekeken LIVE zender'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/NPO 1 live'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/NPO 2 live'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/NPO 3 live'), 0)

