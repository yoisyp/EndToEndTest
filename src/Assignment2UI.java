import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Campos textos
		driver.findElement(By.name("name")).sendKeys("Yoisy Perez");
		driver.findElement(By.name("email")).sendKeys("yperez@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("yoisy123");
		
		//Checkbox
		driver.findElement(By.id("exampleCheck1")).click();
				
		//Dropdown. Se crea un webelement, se define objeto tipo Select para el webelement creado y luego accedo a la opcion del select que se desea. 
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Female");
		
		//Radiobuttons
		driver.findElement(By.id("inlineRadio1")).click();
		
		//Calendar ***********
		driver.findElement(By.name("bday")).sendKeys("10/22/1981");
		
		//Boton Submit
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
	}

}
