import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
//Para que funcione testNG hay que descargar testNg jar del repositorio maven: https://mvnrepository.com/artifact/org.testng/testng 
//Luego click derecho en el proyecto/Property /Buit Java path/ Tab Library/add external y se a;ade el jar descargado.


public class End2End {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 		
	    driver.get("https://book.spicejet.com/");
	    
	    //Seleccionando Radiobutton One Way, el cual inhabilita el dropdown Return date
	    driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
		
		//VARIANTE 1: Localizar el dropdown From y seleccionar origen DEL
        //driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1")).click();
		//driver.findElement(By.cssSelector("option[value='DEL']")).click();
		
		
	    //VARIANTE 2: LocalizaR el dropdown From y seleccionar DEL
		//Dropdown. Se crea un webelement, se define objeto tipo Select para el webelement creado y luego accedo a la opcion del select que se desea. 
     	WebElement fromdropdown = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1"));
		Select fromSelect = new Select(fromdropdown);
		fromSelect.selectByValue("DEL");
		Thread.sleep(2000);
	
		
		//Localizar el dropdown To y seleccionar el destino 
		driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click(); //Selecciona Chennai variante 2, no funciona en Selenium pero si en navegador
		
		
		//Manejo de calendario. Se selecciono el dia actual
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();  //No funciona en Selenium, pero si en el navegador
										
		//Manejo de segundo calendario (Return date) inicialmente deshabilitado
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Its disabled");
			Assert.assertTrue(true);			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		//Marcar checkbox Sr. Citizen
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//Anadiendo los Passengers, cambia para la actual pagina, hay que tratar 3 dropdown dentro de uno
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
	
		//Pendiente seleccionar el dropdown de adentro para indicar cantidad de pasajeros		

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");//Compara lo que ofrece selenium y lo que se espera
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//Manejo del dropdown Currency, seleccionando USD
		
		
				
				

		//Boton Search
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
	}

}
