package elementos;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

public class Elementos extends Browser {


	protected WebDriverWait wait;

	public static void threadSleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.out.println("cant wait this time");
		}
	}

	public void screenshot() {

		try {
			Robot robot = new Robot();
			Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

			BufferedImage screen = robot.createScreenCapture(rect);

			DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy-MM-dd HHmmss");

			driver.manage().window().maximize();
			ImageIO.write(screen, "JPG",
					new File("src/test/resources/evidence/" + dtf2.format(LocalDateTime.now()) + ".jpg"));
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
//	public static void takeScreenShot(String nomeArquivo) throws Exception {
//
//		TakesScreenshot scrShot = ((TakesScreenshot) Browser.driver);
//		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
//		String imageFileDir = System.getProperty("user.dir") + "src/test/resources/evidence/";
//		FileUtils.copyFile(srcFile, new File(imageFileDir, nomeArquivo));
//
//	}
//	
//	
//	@AfterStep
//	public void tirarPrint() throws Exception {
//
//		Thread.sleep(5000);
//		Date dataAtual = new Date();
//		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
//		String dataFormatada = dateFormat.format(dataAtual);
//		String screamshootname = dataFormatada + ".png";
//		Elementos.takeScreenShot(screamshootname);
//
//		PDFCreator.AdicionaImagemaoPDF(screamshootname);
//
//	}

	public static WebElement findingElement(By element) {
		return driver.findElement(element);
	}

	public void waitElementToBeClickable(By element, long timeOutInSeconds) {
		this.wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void clickHim(By element) {
		waitClickable(element);
		findingElement(element).click();
	}

	public static void waitLoad(By element, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public static void waitClickable(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	public static void clearAndWrite(By field, String txt) {
		if (findingElement(field).isDisplayed()) {
			waitClickable(field);
			findingElement(field).clear();
			findingElement(field).sendKeys(txt);
		}
	}

	public static void selectComboBox(By by, String textCountry) {
		WebElement element = findingElement(by);
		Select countryBox = new Select(element);
		countryBox.selectByVisibleText(textCountry);
	}
	

	
}