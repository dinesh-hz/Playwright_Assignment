
Feature: Search Module

Background:
Given User launches application url of Searchmodule

@validproduct
Scenario: Verify valid product search
When User clicks Products page
And User enters product name
And User clicks Search button
Then Search result should display