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

WebUI.click(findTestObject('Object Repository/Page_NLZIET/Profiel icoon'))

WebUI.click(findTestObject('Object Repository/Page_NLZIET/Inloggen button login pagina'))

WebUI.setText(findTestObject('Object Repository/Page_Inloggen - NLZIET/Input veld E-mailadres'), 'frank@nlziet.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inloggen - NLZIET/input_Wachtwoord_Password'), 'IGdoYstdT1wyJJEQsLwLog==')

WebUI.click(findTestObject('Object Repository/Page_Inloggen - NLZIET/Inloggen button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inloggen - NLZIET/strong_Er is een fout in het formulier'), 
    'Er is een fout in het formulier')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inloggen - NLZIET/li_Ongeldige e-mailadres of wachtwoord'), 
    'Ongeldige e-mailadres of wachtwoord')

WebUI.closeBrowser()

