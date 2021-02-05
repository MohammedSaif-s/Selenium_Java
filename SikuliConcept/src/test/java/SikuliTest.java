import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliTest 
{
	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=eIrMbAQSU34");
		Screen s = new Screen();
					
		Pattern pauseImg = new Pattern("C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\Java Programs\\SikuliConcept\\pause.png");
		s.wait(pauseImg,2000);
		s.click(pauseImg.similar(0.70));
		//s.click(pauseImg.similar(0.70));
		
		Pattern playImg = new Pattern("C:\\Users\\m.saif.sanaguppam\\Desktop\\Azure\\SAIF\\Java Notes\\Java Programs\\SikuliConcept\\play.png");
		s.wait(playImg,2000);
		s.click(playImg.similar(0.70));
		Thread.sleep(3000);
		
		driver.quit();
	}

}
