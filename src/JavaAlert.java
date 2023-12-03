import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String text = "Yoisy";
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Escribir nombre en campo de texto name
		driver.findElement(By.id("name")).sendKeys(text);
		
		//Click en boton alert 
		driver.findElement(By.cssSelector("[id='alertbtn']")).click(); // css: [atributo='valor']  alertbtn es valor del atributo id
		
		//Manejoo de confirmacion de alerta. switch().alert() selenium reconoce alertas presentes en la pagina, cambia del browser hacia la ventana de alerta.
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();//Click en boton para aceptar la alerta presente en el browser (boton OK o YES, or Accept, etc)
		
		//Manejoo de cancelacion de alerta. Click en boton Confirm 
		driver.findElement(By.id("confirmbtn")).click(); // css: [atributo='valor']  alertbtn es valor del atributo id
		System.out.println(driver.switchTo().alert().getText()); //Imprimo texto que sale en la alerta
		driver.switchTo().alert().dismiss();//Click en boton para rechazar/cancelar la alerta presente en el browser (boton NO o CANCEL, etc)
				
	} 
}
