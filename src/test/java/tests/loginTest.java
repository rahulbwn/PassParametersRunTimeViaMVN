package tests;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class loginTest {

	@Test
	public void login() throws IOException  {
		
//		//Open chrome browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		
//		//Open URL of the Application
//		driver.get("URL");
//		
//		//Create WebElements
//		WebElement username=driver.findElement(By.xpath(""));
//		
//		WebElement password=driver.findElement(By.xpath(""));
//		
//		These are new chnages
//		//Read MyProject.properties
//		
		Properties prop=new Properties();
		
		//Load properties file
		
		//prop.load(loginTest.class.getClassLoader().getResourceAsStream("MyProject.properties"));
		FileInputStream fis = new FileInputStream("src/test/resources/MyProject.properties");
		prop.load(fis);
		String uName_prop=prop.getProperty("uName");//AgentHunt
		String pwd_prop=prop.getProperty("Pwd");//MissionImpossible

		String username_mvn=System.getProperty("username");
		String password_mvn=System.getProperty("password");

		String uName=(username_mvn!=null)?username_mvn:uName_prop;
		String pwd=(password_mvn!=null)?password_mvn:pwd_prop;
		
		System.out.println("Username Value is ==> " +uName);
		System.out.println("Password Value is ==> " +pwd);
		//Enter username and password values
		
//       	username.sendKeys(uName);//AgentHunt
//		password.sendKeys(pwd);//MissionImpossible

		//Run CMD- mvn -Dusername=AgentHunt -Dpassword=MissionImpossible clean install
	}
}
