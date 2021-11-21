$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Book a room in adactinhotelapp",
  "description": "",
  "id": "book-a-room-in-adactinhotelapp",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Visibility of Login page",
  "description": "",
  "id": "book-a-room-in-adactinhotelapp;visibility-of-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user should enter the vaild username in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should enter the vaid password in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click the Login button to navigate to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.open_the_login_page()"
});
formatter.result({
  "duration": 9322584800,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_should_enter_the_vaild_username_in_the_username_field()"
});
formatter.result({
  "duration": 137968100,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_should_enter_the_vaid_password_in_the_password_field()"
});
formatter.result({
  "duration": 166460700,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_click_the_Login_button_to_navigate_to_login_page()"
});
formatter.result({
  "duration": 2159426400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Visiblity of user requested Hotel",
  "description": "",
  "id": "book-a-room-in-adactinhotelapp;visiblity-of-user-requested-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@hotelSelect"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User must choose the location from Drop down list",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User choose the Hotel from Drop down list",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User must choose the Room Type from drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User must choose the No.of Rooms from drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User must be enter the check-in date in dd/mm/yyyy format",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User must be enter the check-out date in dd/mm/yyyy format",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User must choose the No.of adults in room from drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User choose the No.of Children in room from drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click the search button to nagvigate to selected Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.user_must_choose_the_location_from_Drop_down_list()"
});
formatter.result({
  "duration": 702671200,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_choose_the_Hotel_from_Drop_down_list()"
});
formatter.result({
  "duration": 538021100,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_must_choose_the_Room_Type_from_drop_down_list()"
});
formatter.result({
  "duration": 175674600,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_must_choose_the_No_of_Rooms_from_drop_down_list()"
});
formatter.result({
  "duration": 297764600,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_must_be_enter_the_check_in_date_in_dd_mm_yyyy_format()"
});
formatter.result({
  "duration": 152840400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_must_be_enter_the_check_out_date_in_dd_mm_yyyy_format()"
});
formatter.result({
  "duration": 144763400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_must_choose_the_No_of_adults_in_room_from_drop_down_list()"
});
formatter.result({
  "duration": 282686900,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_choose_the_No_of_Children_in_room_from_drop_down_list()"
});
formatter.result({
  "duration": 279142000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.click_the_search_button_to_nagvigate_to_selected_Hotel_page()"
});
formatter.result({
  "duration": 1254245600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Select the Hotel",
  "description": "",
  "id": "book-a-room-in-adactinhotelapp;select-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@confirmhotel"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "click the Radio button to select the Hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "click the continue button to navigate to payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.click_the_Radio_button_to_select_the_Hotel()"
});
formatter.result({
  "duration": 278069000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.click_the_continue_button_to_navigate_to_payment_page()"
});
formatter.result({
  "duration": 1191603300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Book a hotel with payment details",
  "description": "",
  "id": "book-a-room-in-adactinhotelapp;book-a-hotel-with-payment-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@bookhotel"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User should enter the first name in first name field",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User should enter the last name in last name field",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User Should enter the Bilding address in the address field",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User should enter the 16 digit Credit card Number in the Credit card No field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User must choose the credit card type from the drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User must choose the expriy month from the drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user must choose the expiry year from the drop down list",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user should enter the CVV number in the CVV portal",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "click the booknow button to navigate to book confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.user_should_enter_the_first_name_in_first_name_field()"
});
formatter.result({
  "duration": 276787600,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_should_enter_the_last_name_in_last_name_field()"
});
formatter.result({
  "duration": 205082300,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_Should_enter_the_Bilding_address_in_the_address_field()"
});
formatter.result({
  "duration": 168512800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 22
    }
  ],
  "location": "Adactin.user_should_enter_the_digit_Credit_card_Number_in_the_Credit_card_No_field(int)"
});
formatter.result({
  "duration": 390556300,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_must_choose_the_credit_card_type_from_the_drop_down_list()"
});
formatter.result({
  "duration": 224134400,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_must_choose_the_expriy_month_from_the_drop_down_list()"
});
formatter.result({
  "duration": 372565500,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_must_choose_the_expiry_year_from_the_drop_down_list()"
});
formatter.result({
  "duration": 202084200,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.user_should_enter_the_CVV_number_in_the_CVV_portal()"
});
formatter.result({
  "duration": 142726500,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.click_the_booknow_button_to_navigate_to_book_confirmation_page()"
});
formatter.result({
  "duration": 115792500,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "visibiity of booking confirmation page to navaigate to itinerary page",
  "description": "",
  "id": "book-a-room-in-adactinhotelapp;visibiity-of-booking-confirmation-page-to-navaigate-to-itinerary-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@bookingConfirmation"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User should check the Hotel details are correct",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Click the My itinerary button to naviagate Itinerary page",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.user_should_check_the_Hotel_details_are_correct()"
});
formatter.result({
  "duration": 10835000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.click_the_My_itinerary_button_to_naviagate_Itinerary_page()"
});
formatter.result({
  "duration": 6731643000,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Visiblity of itinerary page",
  "description": "",
  "id": "book-a-room-in-adactinhotelapp;visiblity-of-itinerary-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@itinerary"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "User should check the Itinerary details are correct",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "Click the Logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin.user_should_check_the_Itinerary_details_are_correct()"
});
formatter.result({
  "duration": 629892000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin.click_the_Logout_button()"
});
formatter.result({
  "duration": 585950600,
  "status": "passed"
});
});