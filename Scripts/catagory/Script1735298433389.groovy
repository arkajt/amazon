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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_Email or mobile phone number_email'), 'arkatabwn@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/input_Wrong or Invalid email address or mob_77ed40'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Amazon Sign In/input_Forgot password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/i_Sign Out_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/a_See all'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Mobiles, Computers'), 
    'Mobiles, Computers')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_TV, Appliances, Electronics'), 
    'TV, Appliances, Electronics')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Mens Fashion'), 
    'Men\'s Fashion')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Womens Fashion'), 
    'Women\'s Fashion')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Home, Kitchen, Pets'), 
    'Home, Kitchen, Pets')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Beauty, Health, Grocery'), 
    'Beauty, Health, Grocery')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Sports, Fitness, Bags, Luggage'), 
    'Sports, Fitness, Bags, Luggage')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Toys, Baby Products, Kids Fashion'), 
    'Toys, Baby Products, Kids\' Fashion')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Car, Motorbike, Industrial'), 
    'Car, Motorbike, Industrial')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Books'), 
    'Books')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/div_Movies, Music  Video Games'), 
    'Movies, Music & Video Games')

WebUI.closeBrowser()

