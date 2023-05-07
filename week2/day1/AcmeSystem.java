package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeSystem {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	String title = driver.getTitle();
	System.out.println(title);
}
}
