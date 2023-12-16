import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//TestNG is one of the testing frameworks

public class UpdateDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		

	//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); //Calendario de retorno deshabilitado, retorna false
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //este click habilita el calendario de retorno
	//	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); //Calendario de retorno habilitado, retorna true
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//Manejo del segundo calendrio cuando se habilita
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		//Count the number of checkboxes   input[type='checkbox'
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				
		//Manejo de segundo dropdown
		driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
		
			//Anadir 2 adults
		
		/*int i=1;	
	while (i<5)
	{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times para a;adir 4 adultos
		i++;
	}*/
			
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for(int i=1;i<5;i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
		
	driver.findElement(By.id("btnclosepaxoption")).click();
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");//Compara lo que ofrece selenium y lo que se espera
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	
	}

}
