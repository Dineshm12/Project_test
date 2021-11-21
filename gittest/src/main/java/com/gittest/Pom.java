package com.gittest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom {
	//Login
		@FindBy(id="username")
		public static WebElement username;
		@FindBy(id="password")
		public static WebElement password;
		@FindBy(id="login")
		public static WebElement login;
		//search Hotel
		@FindBy(id="location")
		public static WebElement select_location;
		@FindBy(id="hotels")
		public static WebElement hotels_list;
		@FindBy(id="room_type")
		public static WebElement room_type;
		@FindBy(id="room_nos")
		public static WebElement no_of_rooms;
		@FindBy(id="datepick_in")
		public static WebElement check_indate;
		@FindBy(id="datepick_out")
		public static WebElement check_outdate;
		@FindBy(id="adult_room")
		public static WebElement adult_perroomcount;
		@FindBy(id="child_room")
		public static WebElement child_perroomcount;
		@FindBy(id="Submit")
		public static WebElement search;
		//Reset Search fields
		@FindBy(id="Reset")
		public static WebElement reset;
		//select Hotel
		@FindBy(id="radiobutton_0")
		public static WebElement confirm_selected_hotel;
		@FindBy(id="continue")
		public static WebElement continue_selected_hotel;
		@FindBy(id="cancel")
		public static WebElement cancel_selected_hotel;
		//Details to Book a Room
		@FindBy(id="first_name")
		public static WebElement first_name;
		@FindBy (id="last_name")
		public static WebElement last_name;
		@FindBy(id="address")
		public static WebElement address;
		@FindBy(id="cc_num")
		public static WebElement Credit_card_number;
		@FindBy(id="cc_type")
		public static WebElement select_credit_card_type;
		@FindBy(id="cc_exp_month")
		public static WebElement Creditcard_Expirymonth;
		@FindBy(id="cc_exp_year")
		public static WebElement Creditcard_Expiryyear;
		@FindBy(id="cc_cvv")
		public static WebElement Creditcard_CVVno;
		@FindBy(id="book_now")
		public static WebElement booknow;
		@FindBy(id="cancel")
		public static WebElement cancel_booking;
		//Booking confirmation
		@FindBy(id="search_hotel")
		public static WebElement SearchHotel_Bookconf;
		@FindBy(id="my_itinerary")
		public static WebElement my_itinerary;
		@FindBy(id="logout")
		public static WebElement logout_Bookconf;
		
		
		
}
