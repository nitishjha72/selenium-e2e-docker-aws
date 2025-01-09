package com.nitish.selenium.tests.vendorportal.pojos;

public record VendorPortalTestData(String username,
                                   String password,
                                   String monthlyEarning,
                                   String annualEarning,
                                   String profitMargin,
                                   String availableInventory,
                                   String searchKeyword,
                                   int searchResultsCount) {
}