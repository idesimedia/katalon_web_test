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

Mobile.startApplication('/Users/frankvanschaik/Desktop/app-prod-release_20220902151338.apk', true)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Alle Nederlandse tv'), 'Alle Nederlandse tv')

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Kijk vooruit, terug en live. Waar en wanneer jij wilt'), 
    'Kijk vooruit, terug en live. Waar en wanneer jij wilt.')

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.Button - Inloggen'), 'Inloggen')

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.Button - Rondkijken'), 'Rondkijken')

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Om programmas te kijken heb je een NLZIET-abonnement nodig'), 
    'Om programma\'s te kijken heb je een NLZIET-abonnement nodig.')

Mobile.closeApplication()

