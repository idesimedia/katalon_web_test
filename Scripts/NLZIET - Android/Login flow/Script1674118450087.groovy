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

Mobile.startApplication('/Users/frankvanschaik/Desktop/app-prod-release_20221214120029.apk', true)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.Button - Inloggen (1)'), 0)

Mobile.pressBack(FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - E-mailadres (1)'), 'frank@nlziet.nl', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Android/android.widget.EditText - Wachtwoord (1)'), 'LxdBhhmndicc6tGmqyJo5w==', 
    0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.Button - Log in (1)'), 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.closeApplication()

not_run: Mobile.startApplication('/Users/frankvanschaik/Desktop/app-prod-release_20221214120029.apk', true)

not_run: Mobile.tap(findTestObject(''), 0)

not_run: Mobile.pressBack()

not_run: Mobile.setText(findTestObject(''), 'frank@nlziet.nl', 0)

not_run: Mobile.setEncryptedText(findTestObject(''), 'LxdBhhmndicc6tGmqyJo5w==', 0)

not_run: Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Hier kun je nieuwe profielen aanmaken en wisselen naar een ander profiel'), 
    'Hier kun je nieuwe profielen aanmaken en wisselen naar een ander profiel')

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/android.widget.ImageView (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/android.widget.ImageView (2)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/android.widget.ImageView (3)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/android.widget.ImageView (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Nu op tv'), 'Nu op tv')

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Verder kijken'), 'Verder kijken')

Mobile.scrollToText('Mijn series', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Mijn series'), 'Mijn series')

Mobile.scrollToText('Kijk later', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Kijk later'), 'Kijk later')

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Nu geen tijd Voeg de aflevering dan toe aan Kijk later'), 
    'Nu geen tijd? Voeg de aflevering dan toe aan \'Kijk later\'')

Mobile.tapAndHold(findTestObject(''), 0, 0, FailureHandling.OPTIONAL)

Mobile.scrollToText('Meest bekeken', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Meest bekeken'), 'Meest bekeken')

Mobile.scrollToText('Vooruitkijken NPO Plus', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Vooruitkijken NPO Plus'), 'Vooruitkijken NPO Plus')

Mobile.scrollToText('Vooruitkijken', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Vooruitkijken'), 'Vooruitkijken')

Mobile.scrollToText('Aanbevolen NPO Plus', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Aanbevolen NPO Plus'), 'Aanbevolen NPO Plus')

Mobile.scrollToText('Aanbevolen', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Aanbevolen'), 'Aanbevolen')

Mobile.scrollToText('Films NPO Plus', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Films NPO Plus'), 'Films NPO Plus')

Mobile.scrollToText('Films', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Films'), 'Films')

Mobile.closeApplication()

