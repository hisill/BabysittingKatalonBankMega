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

Mobile.startApplication('D:\\Apk Mobile\\Diary with lock_v4.90_apkpure.com.apk', true)

String masuk = Mobile.getText(findTestObject('Object Repository/diary/pengingat/android.widget.Button - Masuk'), 0)

Mobile.verifyMatch(masuk, 'masuk', false)

Mobile.tap(findTestObject('Object Repository/diary/android.widget.ImageButton'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/diary/android.widget.EditText - Menambahkan judul'), 'Hari ini', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setEncryptedText(findTestObject('Object Repository/diary/android.widget.EditText - Mulai mengetik di sini'), 'tzH6RvlfSTg=', 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/diary/android.widget.TextView'), 0)
//
