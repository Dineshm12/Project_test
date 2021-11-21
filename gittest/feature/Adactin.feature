Feature: Book a room in adactinhotelapp
@login
Scenario: Visibility of Login page
Given Open the login page
When user should enter the vaild username in the username field
And user should enter the vaid password in the password field
Then user click the Login button to navigate to login page
@hotelSelect
Scenario: Visiblity of user requested Hotel 
Given User must choose the location from Drop down list
When User choose the Hotel from Drop down list
And User must choose the Room Type from drop down list
And User must choose the No.of Rooms from drop down list
And User must be enter the check-in date in dd/mm/yyyy format
And User must be enter the check-out date in dd/mm/yyyy format 
And User must choose the No.of adults in room from drop down list
And User choose the No.of Children in room from drop down list
Then click the search button to nagvigate to selected Hotel page
@confirmhotel
Scenario: Select the Hotel
Given click the Radio button to select the Hotel
Then click the continue button to navigate to payment page
@bookhotel
Scenario: Book a hotel with payment details
Given User should enter the first name in first name field
When  User should enter the last name in last name field
And User Should enter the Bilding address in the address field
And User should enter the 16 digit Credit card Number in the Credit card No field
And User must choose the credit card type from the drop down list
And User must choose the expriy month from the drop down list
And user must choose the expiry year from the drop down list
And user should enter the CVV number in the CVV portal
Then click the booknow button to navigate to book confirmation page
@bookingConfirmation
Scenario: visibiity of booking confirmation page to navaigate to itinerary page
Given User should check the Hotel details are correct
Then Click the My itinerary button to naviagate Itinerary page
@itinerary
Scenario: Visiblity of itinerary page
Given User should check the Itinerary details are correct
Then Click the Logout button



