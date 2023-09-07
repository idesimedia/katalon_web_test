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

WebUI.maximizeWindow()

WebUI.enableSmartWait()

WebUI.verifyElementText(findTestObject('Object Repository/Home - Top Menu'), 'Home')

WebUI.verifyElementText(findTestObject('Object Repository/TV en Gids - Top Menu'), 'Tv & gids')

WebUI.verifyElementText(findTestObject('Object Repository/Kijk later - Top Menu'), 'Kijk later')

WebUI.verifyElementText(findTestObject('Object Repository/Mijn series - Top Menu'), 'Mijn series')

WebUI.verifyElementPresent(findTestObject('Object Repository/Zoeken icon - Top Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Account icon - Top Menu'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Contentrij - Uitgelicht'))

WebUI.verifyElementPresent(findTestObject('Object Repository/NPO Plus Deelnemer Button'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RTL Deelnemer Button'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/KIJK Deelnemer Button'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/REGIO Deelnemer Button'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Nu op tv'), 'Nu op tv')

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Zomer kijktips'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Zomer kijktips'), 'Zomer kijktips', FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Meest bekeken'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Meest bekeken'), 'Meest bekeken', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Vooruitkijken NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Vooruitkijken NPO Plus'), 'Vooruitkijken NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Vooruitkijken'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Vooruitkijken'), 'Vooruitkijken')

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Aanbevolen NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Aanbevolen NPO Plus'), 'Aanbevolen NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Aanbevolen'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Aanbevolen'), 'Aanbevolen')

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Films NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Films NPO Plus'), 'Films NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Films'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Films'), 'Films')

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Series NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Series NPO Plus'), 'Series NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Series'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Titel - Series'), 'Series')

WebUI.verifyElementText(findTestObject('Object Repository/Link - Cookie instellingen'), 'Cookie-instellingen')

WebUI.verifyElementClickable(findTestObject('Object Repository/Link - Cookie instellingen'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Alle cookies accepteren Button'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Alle cookies accepteren Button'), 'Alle cookies accepteren')

WebUI.verifyElementClickable(findTestObject('Object Repository/Alle cookies accepteren Button'))

WebUI.click(findTestObject('Object Repository/Link - Cookie instellingen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Mijn keuzes bevestigen Button'), 0)

WebUI.click(findTestObject('Object Repository/Mijn keuzes bevestigen Button'))

WebUI.delay(5)

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Pop-up cookie-instellingen'))

WebUI.scrollToElement(findTestObject('Object Repository/Titel - Nu op tv'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - NPO 1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - NPO 2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - NPO 3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTL 4'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTL 5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - SBS 6'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - RTL 7'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTL 7'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Veronica'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - NET 5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTL 8'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTL Z'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - SBS 9'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - SBS 9'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Insight TV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - EEN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Canvas'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Ketnet'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - TV 538'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTL Crime'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - RTL Lounge'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTL Lounge'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTL Telekids'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Pebble TV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - SBS6 Classics'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - ONS'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - NPO 1 Extra'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - NPO 2 Extra'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - NPO Politiek'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - NPO Politiek'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - BBC First'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - BBC One'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - BBC Two'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - BBC World News'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - BBC Entertainment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - BBC Entertainment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - History Channel'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Crime Investigation'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Curiosity'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - E-Entertainment'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - Euro News'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Euro News'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Omrop Fryslan'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTV Noord'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTV Drenthe'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - TV Oost'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - TV Gelderland'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - Omroep Flevoland'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Omroep Flevoland'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - NHTV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - RTV Utrecht'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - TV West'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - TV Rijnmond'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - TV Rijnmond'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Omroep Zeeland'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - Omroep Brabant'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - L1 TV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/LIVE - AT5'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Home - Top Menu'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/LIVE - NPO 1'), 0)

WebUI.navigateToUrl('https://app.nlziet.nl/live/npo1')

WebUI.verifyElementText(findTestObject('Object Repository/Pop-up modal - Je bent niet ingelogd'), 'Je bent niet ingelogd')

WebUI.verifyElementText(findTestObject('Object Repository/Pop-up modal - Om programmas te kijken moet je ingelogd zijn met je NLZIET-account'), 
    'Om programma’s te kijken moet je ingelogd zijn met je NLZIET-account.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Pop-up modal - Inloggen button'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Pop-up modal - Nog geen account_Meld je aan'), 'Nog geen account? Meld je aan.')

WebUI.click(findTestObject('Page_NLZIET  Aanmelden/Pop-up modal - Sluiten X button'))

WebUI.navigateToUrl('https://app.nlziet.nl/live/npo1')

WebUI.click(findTestObject('Object Repository/Pop-up modal - Inloggen button'))

WebUI.navigateToUrl('https://app.nlziet.nl/')

WebUI.scrollToElement(findTestObject('Object Repository/NPO Plus Deelnemer Button'), 0)

WebUI.click(findTestObject('Object Repository/NPO Plus Deelnemer Button'))

WebUI.closeBrowser()

WebUI.closeBrowser()

