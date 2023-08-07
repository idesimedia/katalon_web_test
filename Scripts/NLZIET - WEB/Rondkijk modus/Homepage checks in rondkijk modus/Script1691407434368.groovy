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

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Home - Top Menu'), 'Home')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/TV en Gids - Top Menu'), 'Tv & gids')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Kijk later - Top Menu'), 'Kijk later')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Mijn series - Top Menu'), 'Mijn series')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/Zoeken icon - Top Menu'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/Account icon - Top Menu'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_NLZIET/Contentrij - Uitgelicht'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/NPO Plus Deelnemer Button'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/RTL Deelnemer Button'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/KIJK Deelnemer Button'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/REGIO Deelnemer Button'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Nu op tv'), 'Nu op tv')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Zomer kijktips'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Zomer kijktips'), 'Zomer kijktips', FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Meest bekeken'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Meest bekeken'), 'Meest bekeken')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Vooruitkijken NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Vooruitkijken NPO Plus'), 'Vooruitkijken NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Vooruitkijken'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Vooruitkijken'), 'Vooruitkijken')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Aanbevolen NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Aanbevolen NPO Plus'), 'Aanbevolen NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Aanbevolen'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Aanbevolen'), 'Aanbevolen')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Films NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Films NPO Plus'), 'Films NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Films'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Films'), 'Films')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Series NPO Plus'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Series NPO Plus'), 'Series NPO Plus')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Series'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Titel - Series'), 'Series')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Link - Cookie instellingen'), 'Cookie-instellingen')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/Link - Cookie instellingen'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/Alle cookies accepteren Button'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET/Alle cookies accepteren Button'), 'Alle cookies accepteren')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_NLZIET/Alle cookies accepteren Button'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET/Link - Cookie instellingen'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_NLZIET/Mijn keuzes bevestigen Button'), 0)

WebUI.click(findTestObject('Object Repository/Page_NLZIET/Mijn keuzes bevestigen Button'))

WebUI.delay(5)

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Page_NLZIET/Pop-up cookie-instellingen'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Titel - Nu op tv'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - NPO 1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - NPO 2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - NPO 3'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL 4'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL 5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - SBS 6'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL 7'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL 7'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Veronica'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - NET 5'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL 8'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL Z'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - SBS 9'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - SBS 9'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Insight TV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - EEN'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Canvas'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Ketnet'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - TV 538'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL Crime'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL Lounge'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL Lounge'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTL Telekids'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Pebble TV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - NPO 1 Extra'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - NPO 2 Extra'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - NPO Politiek'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - NPO Politiek'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - BBC First'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - BBC One'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - BBC Two'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - BBC World News'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - BBC Entertainment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - BBC Entertainment'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - History Channel'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Crime Investigation'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Curiosity'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - E-Entertainment'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - Euro News'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Euro News'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Omrop Fryslan'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTV Noord'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTV Drenthe'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - TV Oost'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - TV Gelderland'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - Omroep Flevoland'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Omroep Flevoland'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - NHTV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - RTV Utrecht'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - TV West'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - TV Rijnmond'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - TV Rijnmond'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Omroep Zeeland'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - Omroep Brabant'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - L1 TV'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET/LIVE - AT5'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/Home - Top Menu'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET/LIVE - NPO 1'), 0)

WebUI.navigateToUrl('https://app.nlziet.nl/live/npo1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Aanmelden/Pop-up modal - Je bent niet ingelogd'), 
    'Je bent niet ingelogd')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Aanmelden/Pop-up modal - Om programmas te kijken moet je ingelogd zijn met je NLZIET-account'), 
    'Om programma’s te kijken moet je ingelogd zijn met je NLZIET-account.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET  Aanmelden/Pop-up modal - Inloggen button'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Aanmelden/Pop-up modal - Nog geen account_Meld je aan'), 
    'Nog geen account? Meld je aan.')

WebUI.click(findTestObject('Page_NLZIET/Page_NLZIET  Aanmelden/Pop-up modal - Sluiten X button'))

WebUI.navigateToUrl('https://app.nlziet.nl/live/npo1')

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Aanmelden/Pop-up modal - Inloggen button'))

WebUI.closeBrowser()

WebUI.closeBrowser()

