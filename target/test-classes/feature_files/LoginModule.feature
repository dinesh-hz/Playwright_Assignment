
Feature: Login Module

Background:
Given User launches application url of Loginpagemodule

@loginvalid
Scenario: Verify valid login
When User clicks Signup Login button
And User enters valid email
And User enters valid password
And User clicks Login button
Then User should login successfully

@loginbyinvalid
Scenario: Verify invalid login
When User clicks Signup Login button
And User enters invalid email
And User enters invalid password
And User clicks Login button
Then Error message should display