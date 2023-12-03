import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		
		
		
		//    //a[@value='MAA']  -Xpath for Chennai, existe el valor en dos dropdown
		//    (//a[@value='MAA'])[2]   -Xpath for Chennai en el segundo dropdown, selenium escoge la segunda opcion de Chennai que encuentra
		
		//a[@value='BLR']
		
		
		//ESTA LINEA SIGUIENTE DA ERROR, SELENIUM NO ENCUENTRA EL ELEMENTO
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1")).click(); //Selecciona (abre) primer dropdown
		//driver.findElement(By.cssSelector("option[value='DEL']")).click();	                          
		driver.findElement(By.xpath("//option[@value='DEL']")).click(); //Selecciona Delhi
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //Selecciona Chennai variante 1, no funciona en selenium pero si en el navegador
		
		
		//SEGUNDA Y MEJO0R VARIANTE PARA SELECCIONAR VALORES DE UN DROPDOWN DINAMICO, A TRAVES DEL PARENT EN LUGAR DE INDEXAR CON EL [2]
		
	  //  driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click(); //Selecciona Chennai variante 2, no funciona en Selenium pero si en navegador
		
	
		
		//Manejo de calendario. Se selecciono el dia actual
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();  //No funciona, pero si en el navegador
		

	
	}

}

