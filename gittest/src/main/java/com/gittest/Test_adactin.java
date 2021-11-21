package com.gittest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

public class Test_adactin extends Base_Class {
	public static void main(String[] args) throws IOException {
		
		File f = new File(
				"C:\\Users\\Dinesh\\eclipse-workspace\\Hotel\\Project_test\\gittest\\path\\adactin.properties");
		FileInputStream fi = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fi);
		String url = p.getProperty("url_adactin");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		String firstname = p.getProperty("firstname");
		String lastname = p.getProperty("lastname");
		String billingaddress = p.getProperty("Billingaddress");
		String creditcardno = p.getProperty("creditcardno");
		String cvvno = p.getProperty("cvvnumber");
//Browser Launch
		browser("chrome");
		geturl(url);
		PageFactory.initElements(driver, Pom.class);
		sendkeys(Pom.username, username);
		sendkeys(Pom.password, password);
		click(Pom.login);
		getOption(Pom.select_location);
		dropDown("text", "London",Pom.select_location );
		getOption(Pom.hotels_list);
		dropDown("text", "Hotel Sunshine",Pom.hotels_list);
		dropDown("text", "Double", Pom.room_type);
		dropDown_Index( 4, Pom.no_of_rooms);
		sendkeys(Pom.check_indate, "28/10/2021");
		sendkeys(Pom.check_outdate, "31/10/2021");
		dropDown_Index(2, Pom.adult_perroomcount);
		dropDown_Index(1,Pom.child_perroomcount);
		click(Pom.search);
		click(Pom.confirm_selected_hotel);
		click(Pom.continue_selected_hotel);
		sendkeys(Pom.first_name, firstname);
		sendkeys(Pom.last_name, lastname);
		sendkeys(Pom.address, billingaddress);
		sendkeys(Pom.Credit_card_number, creditcardno);
		dropDown("text","VISA", Pom.select_credit_card_type);
		dropDown("text", "June", Pom.Creditcard_Expirymonth);
		dropDown("value", "2022", Pom.Creditcard_Expiryyear);
		sendkeys(Pom.Creditcard_CVVno, cvvno);
		click(Pom.booknow);
		wait(10);
		click(Pom.my_itinerary);
		screenshot("Adactin_booking_confirmation");
	}
}
