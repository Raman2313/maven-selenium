package JSExecuter;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dead_link {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> link =driver.findElements(By.tagName("a"));
             System.out.println(link.size());
             int brokenlinks =0;
             for(WebElement linkElement:link) {
            	 String hrefValue = linkElement.getAttribute("href");
            	 if(hrefValue==null||hrefValue.isEmpty())
            	 {
            		 System.out.println("href value is empty");
            		 continue;
            	 }
            	 //connection--open, send
            	 URL linkurl =new URL(hrefValue);
            	 HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();
            	 conn.connect();
             
             if(conn.getResponseCode()>400) {

         System.out.println(hrefValue + " " + "broken link");
         brokenlinks++;
            	 
             }
             else
             {
            	 System.out.println(hrefValue + " " + "not broken link" );
             }

	}
             System.out.println("total number of broken link are  "+  brokenlinks);

}
}
