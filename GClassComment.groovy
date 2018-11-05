import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open('YOUR GOOGLE CLASSROOM LINK')
selenium.label("Start")
selenium.refresh()
boolean trigger = selenium.isElementPresent("xpath=//div[contains(text(), 'TYPE THE TEXT OF THE POST ON WHICH YOU WANT TO COMMENT')]")
selenium.gotoIf(trigger + "==false", "Start")
selenium.clickAt("xpath=//div[contains(text(), \"Add class comment\")]", "")
selenium.clickAt("xpath=//div[contains(@aria-label, \"Add class comment\")]", "")
selenium.clickAt("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Add class comment…'])[1]/following::div[1]", "")
//selenium.editContent("xpath=//div[contains(@aria-label, \"Add class comment\")]", "<div>YOUR COMMENT IN HTML FORMAT</div>")
selenium.clickAt("xpath=//div[contains(@jsaction, \"updateAction\") and contains(text(), \"Post\")]", "")
selenium.focus("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::div[1]")
selenium.clickAt("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::div[1]", "")
