
Feature: Add To Cart Module

Background:
Given User launches application url of AddTocardmodule

@addproduct
Scenario: Verify add product to cart
When User navigates to products page
And User clicks Add to cart button
And User clicks View Cart button
Then Product should add into cart successfully