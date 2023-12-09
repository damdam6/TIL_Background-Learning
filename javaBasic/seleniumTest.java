<<<<<<< HEAD
package selenium_practice;

import java.util.ArrayList;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naver.com");
		
		WebElement financeBtn = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
		financeBtn.click();
		
		//��â�� ������ ��â�� ������� �ο��ؾ���
		ArrayList<String> windowHandles =new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));
		
		
		
		//# ���̵� ������
		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));

		searchInput.sendKeys("�Ｚ����");
		searchInput.sendKeys(Keys.ENTER);
	}

}
=======
package selenium_practice;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naver.com");
		
		WebElement financeBtn = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
		financeBtn.click();
		
		//��â�� ������ ��â�� ������� �ο��ؾ���
		ArrayList<String> windowHandles =new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));
		
		
		
		//# ���̵� ������
		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));

		searchInput.sendKeys("�Ｚ����");
		searchInput.sendKeys(Keys.ENTER);
	}

}
>>>>>>> 9a1f1bca099c13c6f0a666380ce9954a025b72b0