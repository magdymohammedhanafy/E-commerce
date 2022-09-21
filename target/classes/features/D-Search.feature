@Test
  Feature: search for products with different parameters
    Scenario Outline: search with product name
      When click on search field
      And search with "<productName>"
      Then user could find "<productName>"
      Examples:
      |productName|
      |book|
      |laptop|
      |nike|

    Scenario Outline: search with sku
      When click on search field
      And search with SKU and click on product "<productSku>"
      Then do assertion with SKU "<productSku>"
      Examples:
        |productSku|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|
