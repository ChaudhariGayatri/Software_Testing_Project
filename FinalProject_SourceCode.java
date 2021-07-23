package MiniProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class FinalProject1
{
	
  @Test
  public void f() throws InterruptedException, IOException
  {
	  
	    //TC01
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar\\chromedriver.exe");		
	    WebDriver w=new ChromeDriver();
		
	    //TC02
		w.get("https://www.demoqa.com");
		
		//TC03
		w.manage().window().maximize();
		
		//TC04
		System.out.println(w.getCurrentUrl());
		
		//TC05
		JavascriptExecutor js = (JavascriptExecutor) w;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");
		
		//TC06 : Widgets
		
		w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)")).click();
		System.out.println (w.getTitle ()); 
		
		JavascriptExecutor js1 = (JavascriptExecutor) w;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		
		// TC07 : Accordian
		
		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/span[1]")).click();
		 JavascriptExecutor js2 = (JavascriptExecutor) w;
		 js2.executeScript("window.scrollTo(0,100)");
		 System.out.println("Accordian webpage is open");

		 Thread.sleep(2000);
	         w.findElement(By.xpath("//*[@id=\"section1Heading\"]")).click();
	         Thread.sleep(2000);
	         w.findElement(By.xpath("//*[@id=\"section2Heading\"]")).click();

	         JavascriptExecutor js3 = (JavascriptExecutor) w;
		 js3.executeScript("window.scrollTo(0,300)");

	         Thread.sleep(2000);
	         w.findElement(By.xpath("//*[@id=\"section3Heading\"]")).click();

	        Thread.sleep(1000);
	 	
	 	 w.navigate().back();
                 w.navigate().back();
		 
		 w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)")).click();
		
		 JavascriptExecutor js4 = (JavascriptExecutor) w;
		 Thread.sleep(2000);
		 js4.executeScript("window.scrollBy(0,600)", "");
	         Thread.sleep(2000);
	 	
	         // TC08 : Auto Complete
		 
	 	 w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]")).click();
	 	 System.out.println("Auto Complete webpage is open");
	 	 Thread.sleep(2000);
	 		
	 	          //Its a defect
	 		     //  w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("Silver");
	 		     //  w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("Pink");
	 		
	 	 TakesScreenshot t1 = (TakesScreenshot) w;
	 	 File src1 = t1.getScreenshotAs(OutputType.FILE);
	 	 Files.copy(src1, new File ("D:\\Screenshot\\AutoCompleteText.png"));
	 	
	 	 w.navigate().back();
                 w.navigate().back();
		
		 w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)")).click();
		
		 JavascriptExecutor js5 = (JavascriptExecutor) w;
		 Thread.sleep(2000);
		 js5.executeScript("window.scrollBy(0,600)", "");
	         Thread.sleep(2000);
	 	
	         // TC09 : Date Picker
		
	        w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]")).click();
	        Thread.sleep(1000);
	        w.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]")).clear();

	        Select s1=new Select(w.findElement(By.className("react-datepicker__month-select")));
	        s1.selectByIndex(6);

	        Select s2=new Select(w.findElement(By.className("react-datepicker__year-select")));
	        s2.selectByValue("1997");

	        w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]")).click();   
	        Thread.sleep(1000);
	      
	        //DATE AND TIME

	        w.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).clear();
	        Thread.sleep(1000);

	        w.findElement(By.className("react-datepicker__month-read-view--down-arrow")).click();
	        Thread.sleep(1000);
	        w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]")).click();
	        Thread.sleep(1000);
	        w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[6]")).click();
	        Thread.sleep(1000);
	        //its a defect 
	        w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]")).click();
	        Thread.sleep(1000);
	        w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]")).click();
	        Thread.sleep(1000); 
	        w.findElement(By.xpath("//li[contains(text(),'00:45')]")).click();
	        Thread.sleep(1000);
	      
	        w.navigate().back();
                w.navigate().back();
	      		
	        w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)")).click();
	      		
	       JavascriptExecutor js6 = (JavascriptExecutor) w;
	       Thread.sleep(2000);
	       js6.executeScript("window.scrollBy(0,600)", "");
	       Thread.sleep(2000);
	 	
	       // TC10 : Slider
		
	       w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]")).click();
	       System.out.println("Slider webpage is open");
	       Thread.sleep(2000);
	 	
	       WebElement slider = w.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
	 	
	       Actions act = new Actions(w);
	       act.dragAndDropBy(slider, -150, 100).perform();         //Move to backword
	       Thread.sleep(2000);
	       act.dragAndDropBy(slider, 200, 100).perform();          //Move to forward
	       Thread.sleep(2000);
	 	
	       w.navigate().back();
               w.navigate().back();
		
	       w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)")).click();
		
	       JavascriptExecutor js7 = (JavascriptExecutor) w;
	       Thread.sleep(2000);
	       js7.executeScript("window.scrollBy(0,600)", "");
	       Thread.sleep(2000); 
	 	
	       // TC11 : Progress Bar
		
	       w.findElement(By.xpath("//span[contains(text(),'Progress Bar')]")).click();
	       System.out.println("Progress Bar webpage is open");
	       Thread.sleep(2000);
	 	
	       w.findElement(By.id("startStopButton")).click();
	       Thread.sleep(4000);
		
	       w.findElement(By.xpath("//button[@id='startStopButton']")).click();
		
	       w.navigate().back();
               w.navigate().back();
		
	       w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)")).click();
		
	       JavascriptExecutor js8 = (JavascriptExecutor) w;
	       Thread.sleep(2000);
	       js8.executeScript("window.scrollBy(0,600)", "");
	       Thread.sleep(2000);
		
	       // TC12 : Tabs
		
	       w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]")).click();
	       System.out.println("Tabs webpage is open");
		
	       w.findElement(By.id("demo-tab-what")).click();
	       Thread.sleep(2000);
	       w.findElement(By.id("demo-tab-origin")).click();
	       Thread.sleep(2000);
	       w.findElement(By.id("demo-tab-use")).click();
	       Thread.sleep(2000);
		
	       w.navigate().back();
               w.navigate().back();
		
	       w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)")).click();
		
	       JavascriptExecutor js9 = (JavascriptExecutor) w;
	       Thread.sleep(2000);
	       js9.executeScript("window.scrollBy(0,600)", "");
	       Thread.sleep(2000);
		
	       // TC13 : Tool Tips
		
	       w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[7]")).click();
	       System.out.println("Tool Tips webpage is open");
               Thread.sleep(2000);
        
               w.findElement(By.id("toolTipButton")).click();
               w.findElement(By.id("toolTipTextField")).sendKeys("Hello");
               Thread.sleep(2000);
        
               w.navigate().back();
               w.navigate().back();
		
	       w.findElement(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)")).click();
		
	       JavascriptExecutor js10 = (JavascriptExecutor) w;
	       Thread.sleep(2000);
	       js10.executeScript("window.scrollBy(0,600)", "");
	       Thread.sleep(2000);
        
               // TC14 : Menu
		
     	       w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]")).click();
     	       System.out.println("Menu webpage is open");
     	       Thread.sleep(2000);
     	
     	       Actions A=new Actions(w);
     	       A.moveToElement(w.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a"))).perform();            //Main Item 1
     	       Thread.sleep(2000);
     	
     	       A.moveToElement(w.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"))).perform();            //Main item 2
     	       w.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a")).click();                      //Sub Sub Element
     	       Thread.sleep(2000);
     	
     	       A.moveToElement(w.findElement(By.xpath("//*[@id=\"nav\"]/li[3]/a"))).perform();            //Main Item 3
     	       Thread.sleep(2000);
     	
  }
  
  
  @Test(enabled = false)   
  public void f2()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar\\chromedriver.exe");		
	    WebDriver w=new ChromeDriver();
		
		w.get("https://www.demoqa.com");
		
		//TC15 : Select Menu........This button is not working
		w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]")).click();
				
		w.close();
		  
  }
  

  
}
