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

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/button_Alle cookies accepteren'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_NLZIET/Tv en Gids menu-item'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/div_Vandaag'), 'Vandaag')

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Dagselectie Dropdown icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/div_Gisteren'), 'Gisteren')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/div_Morgen'), 'Morgen')

WebUI.switchToWindowTitle('NLZIET • Tv & gids')

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Dagselectie Dropdown icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/button_Nu  straks'), 'Nu & straks')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/button_Primetime'), 'Primetime')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo NPO 1'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo NPO 2'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo NPO 3'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTL 4'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTL 5'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo SBS 6'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTL 7'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Veronica'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo NET 5'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTL 8'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTL Z'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo SBS 9'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Insight TV'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo EEN'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Canvas'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Ketnet'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo TV 538'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTL Lounge'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTL Telekids'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Pebble TV'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo NPO 1 Extra'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo NPO 2 Extra'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo NPO Politiek'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo BBC First'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo BBC One'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo BBC Two'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo BBC World News'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo BBC Entertainment'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo History'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Crime Investigation'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Curiosity Channel'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo E-Entertainment'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Euronews'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Omroep Fryslan'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTV Noord'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTV Drenthe'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/TV Oost'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Omroep Gelderland'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Omroep Flevoland'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo NH TV'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo RTV Utrecht'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo TV West'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo TV Rijnmond'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Omroep Zeeland'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo Omroep Brabant'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo L1 TV'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Logo AT5'), 0)

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Dropdown kanalen kiezer'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/span_NPO 1'), 'NPO 1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/span_NPO 2'), 'NPO 2')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/span_NPO 3'), 'NPO 3')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/span_RTL 4'), 'RTL 4')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/span_RTL 5'), 'RTL 5')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Tv  gids/span_SBS6'), 'SBS6')

WebUI.scrollToElement(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Dropdown - AT5'), 0)

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Dropdown - AT5'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Dropdown kanalen kiezer'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Dropdown - NPO 1'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Dropdown kanalen kiezer'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/Button Primetime'))

'Checked of de starttijd wordt weergegeven in de EPG'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_NLZIET  Tv  gids/div_1754'))

'Checked of de starttijd wordt weergegeven in de EPG'
WebUI.click(findTestObject('Object Repository/Page_NLZIET  Tv  gids/div_1754'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Aanmelden/h2_Je bent niet ingelogd'), 'Je bent niet ingelogd')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Aanmelden/p_Om programmas te kijken moet je ingelogd _4796e4'), 
    'Om programma’s te kijken moet je ingelogd zijn met je NLZIET-account.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NLZIET  Aanmelden/button_Nog geen account Meld je aan'), 
    'Nog geen account? Meld je aan.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_NLZIET  Aanmelden/Inloggen button'), 0)

WebUI.click(findTestObject('Object Repository/Page_NLZIET  Aanmelden/Inloggen button'))

WebUI.setText(findTestObject('Object Repository/Page_Inloggen - NLZIET/Input veld E-mailadres'), 'frank@nlziet.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inloggen - NLZIET/Input veld wachtwoord'), 'bAEV4ngw9siEiuLZIHeEfg==')

WebUI.click(findTestObject('Object Repository/Page_Inloggen - NLZIET/Inloggen button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inloggen - NLZIET/strong_Er is een fout in het formulier'), 
    'Er is een fout in het formulier')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inloggen - NLZIET/li_Ongeldige e-mailadres of wachtwoord'), 
    'Ongeldige e-mailadres of wachtwoord')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inloggen - NLZIET/Input veld wachtwoord'), 'LxdBhhmndicc6tGmqyJo5w==')

WebUI.click(findTestObject('Object Repository/Page_Inloggen - NLZIET/Inloggen button'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET/button_F R A N K'))

