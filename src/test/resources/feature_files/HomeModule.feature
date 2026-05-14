
Feature: Home Module

Background:
Given User launches application url of HomeModule

@VerifyProducts
Scenario: Verify Products navigation
When User clicks Products menu
Then User should navigate to Products page

@VerifyCart
Scenario: Verify Cart navigation
When User clicks Cart menu
Then User should navigate to Cart page

@VerifySignup
Scenario: Verify Signup Login navigation
When User clicks Signup Login menu
Then User should navigate to Login page