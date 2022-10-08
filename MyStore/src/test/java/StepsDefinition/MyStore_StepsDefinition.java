package StepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStore_StepsDefinition {

	WebDriver driver;

	@Given("User navigate to the homepage")
	public void user_navigate_to_the_homepage() {

		System.setProperty("webdriver.chrome.driver","/home/chathuraj/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@Given("User search any term in the search bar")
	public void user_search_any_term_in_the_search_bar() {

		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Dresses");

		driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
	}
	@Then("User validate that the results returned matches the search term")
	public void user_validate_that_the_results_returned_matches_the_search_term() {

	}


	@Given("User click on Women category")
	public void user_click_on_women_category() throws InterruptedException {

		driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();

		Thread.sleep(10000);
	}
	@Given("User select any value from the color")
	public void user_select_any_value_from_the_color() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='layered_id_attribute_group_16']")).click();

		Thread.sleep(10000);
	}
	@Given("User select category filter item")
	public void user_select_category_filter_item() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='layered_category_8']")).click();

		Thread.sleep(10000);
	}
	@Then("User validate that the results returned matches the filter criteria")
	public void user_validate_that_the_results_returned_matches_the_filter_criteria() {

	}


	@Given("User select any item from the POPULAR section")
	public void user_select_any_item_from_the_popular_section() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")));
		element.click();

		Thread.sleep(1000);
	}

	@Given("User add them to the cart")
	public void user_add_them_to_the_cart() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add_to_cart\"]/button")));
		element.click();

		//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add_to_cart\"]/button")));
		//		element.click();

	}
	@Then("User validate that the item has successfully been added to the cart")
	public void user_validate_that_the_item_has_successfully_been_added_to_the_cart() throws InterruptedException {


	}









}
