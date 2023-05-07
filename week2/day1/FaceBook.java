package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Create new account")).click();
	driver.findElement(By.id("u_d_b_aq")).sendKeys("Karthik");
	driver.findElement(By.className("lastname")).sendKeys("P");
	driver.findElement(By.className("reg_email__")).sendKeys("9750441807");
	driver.findElement(By.id("password_step_input")).sendKeys("abc123");
	
}
}
