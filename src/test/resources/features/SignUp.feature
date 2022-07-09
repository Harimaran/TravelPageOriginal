Feature: SignUp Feature

@signUp
Scenario: User register with valid details
Given User navigates to "https://www.phptravels.com/demo"
And User clicks on Sign Up button
When User Enters all the required details
#|	firstName	|	Hari						|
#|	lastName	|	Prasath					|
#|	eMail			|	hari@email.com	|
#|	phone			|	1234567890			|
#|	address1	|	Add1						|
#|	address2	|	Add2						|
#|	city			|	Chennai					|
#|	state			|	TN							|
#| postalCode|	123456					|
#|	whatsApp		|	1234567890		|
#|	password	|	Password1				|
#|	cPassword	|	Password1				|

|	firstName	|	lastName	|	eMail						|	phone				|	address1	|	address2	|	city		|	state	|	postalCode	|	whatsApp		|	password	|	cPassword	|	
|	Name			|	Last			|	email@email.com	|	1234567890	|	add1			|	add2			|	Chennai	|	AP		|	123123			|	1234567899	|	Password	|	Password	|
|	Name1			|	Last1			|	email@email.com	|	1234567890	|	add1			|	add2			|	Chennai	|	AP		|	123123			|	1234567899	|	Password	|	Password	|


