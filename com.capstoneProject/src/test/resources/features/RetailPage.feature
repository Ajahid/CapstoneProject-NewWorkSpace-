@Retail
Feature: Retail Page


Background: Login TekSchool Retail page
Given User is on Retail website
When User click on MyAccount
And  User click on Login 
And User enter username and password
And User click on Login button
Then User should be logged in to MyAccount dashboard
And User click on Continue button 

Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account link 
And User fill affiliate form with below information
|company|website|taxID|chequePayeeName|
|jahidAbdul|www.jahid.com|123456789|abduljahid|
And User check on About us check box 
Then User should see a success message 

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate information link 
And User click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|BOFA|000123456|12345|AbdulMajeed|789456123|
Then User should see a success message 


Scenario: Edit your account Information 
When User click on ‘Edit your account information’ link 
And User modify below information 
|firstname|lastName|email|telephone|
|abdul|majeed|abdulmajeed1@gmail.com|571-599-2178|
Then User should see a message ‘Success: Your account has been successfully updated.’




