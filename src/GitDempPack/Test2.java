package GitDempPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test2 {
	public static void main(String[] args){ 
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.google.com"); 
		WebElement searchBox = driver.findElement(By.id("gbqfba")); 
		searchBox.submit(); 
		} 

}




