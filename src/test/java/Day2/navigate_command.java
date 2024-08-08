package Day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_command {
public static void main(String args[]) throws MalformedURLException {
	ChromeDriver driver =new ChromeDriver();
	//driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=15989199299501807259&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303358&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
//driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=6069178522258824455&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303358&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
URL url = new URL("https://www.amazon.in/");
driver.navigate().to(url);
//driver.navigate().back()
System.out.println(driver.getCurrentUrl());

}
}
