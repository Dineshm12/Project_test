package stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.gittest.Base_Class;
import com.gittest.Pom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin extends Base_Class {
	
	
	@Given("^Open the login page$")
	public void open_the_login_page() throws Throwable {
		properties("C:\\Users\\Dinesh\\eclipse-workspace\\mainproject\\path\\adactin.properties");
		browser("chrome");
		geturl("http://adactinhotelapp.com/");
		PageFactory.initElements(driver, Pom.class);

	}

	@When("^user should enter the vaild username in the username field$")
	public void user_should_enter_the_vaild_username_in_the_username_field() throws Throwable {
		String username = prop.getProperty("username");
		sendkeys(Pom.username, username);
	}

	@When("^user should enter the vaid password in the password field$")
	public void user_should_enter_the_vaid_password_in_the_password_field() throws Throwable {
		String password = prop.getProperty("password");
		sendkeys(Pom.password, password);
	}

	@Then("^user click the Login button to navigate to login page$")
	public void user_click_the_Login_button_to_navigate_to_login_page() throws Throwable {
		click(Pom.login);
	}

	@Given("^User must choose the location from Drop down list$")
	public void user_must_choose_the_location_from_Drop_down_list() throws Throwable {
		getOption(Pom.select_location);
		dropDown("text", "London",Pom.select_location );
	}

	@When("^User choose the Hotel from Drop down list$")
	public void user_choose_the_Hotel_from_Drop_down_list() throws Throwable {
		getOption(Pom.hotels_list);
		dropDown("text", "Hotel Sunshine",Pom.hotels_list);
	}

	@When("^User must choose the Room Type from drop down list$")
	public void user_must_choose_the_Room_Type_from_drop_down_list() throws Throwable {
		dropDown("text", "Double", Pom.room_type);
	}

	@When("^User must choose the No\\.of Rooms from drop down list$")
	public void user_must_choose_the_No_of_Rooms_from_drop_down_list() throws Throwable {
		dropDown_Index( 4, Pom.no_of_rooms);
	}

	@When("^User must be enter the check-in date in dd/mm/yyyy format$")
	public void user_must_be_enter_the_check_in_date_in_dd_mm_yyyy_format() throws Throwable {
		sendkeys(Pom.check_indate, "28/10/2021");
	}

	@When("^User must be enter the check-out date in dd/mm/yyyy format$")
	public void user_must_be_enter_the_check_out_date_in_dd_mm_yyyy_format() throws Throwable {
		sendkeys(Pom.check_outdate, "31/10/2021");
	}

	@When("^User must choose the No\\.of adults in room from drop down list$")
	public void user_must_choose_the_No_of_adults_in_room_from_drop_down_list() throws Throwable {
		dropDown_Index(2, Pom.adult_perroomcount);
	}

	@When("^User choose the No\\.of Children in room from drop down list$")
	public void user_choose_the_No_of_Children_in_room_from_drop_down_list() throws Throwable {
		dropDown_Index(1,Pom.child_perroomcount);
	}

	@Then("^click the search button to nagvigate to selected Hotel page$")
	public void click_the_search_button_to_nagvigate_to_selected_Hotel_page() throws Throwable {
		click(Pom.search);
	}

	@Given("^click the Radio button to select the Hotel$")
	public void click_the_Radio_button_to_select_the_Hotel() throws Throwable {
		click(Pom.confirm_selected_hotel);
	}

	@Then("^click the continue button to navigate to payment page$")
	public void click_the_continue_button_to_navigate_to_payment_page() throws Throwable {
		click(Pom.continue_selected_hotel);
	}

	@Given("^User should enter the first name in first name field$")
	public void user_should_enter_the_first_name_in_first_name_field() throws Throwable {
		String firstname = prop.getProperty("firstname");		
		sendkeys(Pom.first_name, firstname);
	}

	@When("^User should enter the last name in last name field$")
	public void user_should_enter_the_last_name_in_last_name_field() throws Throwable {
		String lastname = prop.getProperty("lastname");
		sendkeys(Pom.last_name, lastname);
	}

	@When("^User Should enter the Bilding address in the address field$")
	public void user_Should_enter_the_Bilding_address_in_the_address_field() throws Throwable {
		String billingaddress = prop.getProperty("Billingaddress");
		sendkeys(Pom.address, billingaddress);
	}

	@When("^User should enter the (\\d+) digit Credit card Number in the Credit card No field$")
	public void user_should_enter_the_digit_Credit_card_Number_in_the_Credit_card_No_field(int arg1) throws Throwable {
		String creditcardno = prop.getProperty("creditcardno");
		sendkeys(Pom.Credit_card_number, creditcardno);
		
	}

	@When("^User must choose the credit card type from the drop down list$")
	public void user_must_choose_the_credit_card_type_from_the_drop_down_list() throws Throwable {
		dropDown("text","VISA", Pom.select_credit_card_type);
	}

	@When("^User must choose the expriy month from the drop down list$")
	public void user_must_choose_the_expriy_month_from_the_drop_down_list() throws Throwable {
		dropDown("text", "June", Pom.Creditcard_Expirymonth);
	}

	@When("^user must choose the expiry year from the drop down list$")
	public void user_must_choose_the_expiry_year_from_the_drop_down_list() throws Throwable {
		dropDown("value", "2022", Pom.Creditcard_Expiryyear);
	}

	@When("^user should enter the CVV number in the CVV portal$")
	public void user_should_enter_the_CVV_number_in_the_CVV_portal() throws Throwable {
		String cvvno = prop.getProperty("cvvnumber");
		sendkeys(Pom.Creditcard_CVVno, cvvno);
	}

	@Then("^click the booknow button to navigate to book confirmation page$")
	public void click_the_booknow_button_to_navigate_to_book_confirmation_page() throws Throwable {
		click(Pom.booknow);
		wait(10);
	}

	@Given("^User should check the Hotel details are correct$")
	public void user_should_check_the_Hotel_details_are_correct() throws Throwable {
		wait(10);
	}

	@Then("^Click the My itinerary button to naviagate Itinerary page$")
	public void click_the_My_itinerary_button_to_naviagate_Itinerary_page() throws Throwable {
		click(Pom.my_itinerary);
	}

	@Given("^User should check the Itinerary details are correct$")
	public void user_should_check_the_Itinerary_details_are_correct() throws Throwable {
		screenshot("Adactin_booking_confirmation");
		wait(10);
	}

	@Then("^Click the Logout button$")
	public void click_the_Logout_button() throws Throwable {
	click(Pom.logout_Bookconf);
	}

}
