@Test
  Feature: Adding items to wishlist
    Scenario:Click on wishlist button of HTC one M8 android and assert the color of message
      Given Click on wishlist button of HTC one M8 android
      When asser background color of message is green

    Scenario:Get Qty value at wishlist
      Given Click on wishlist button of HTC one M8 android
      When click on main wish list button
      Then get QTY value and verify its bigger than zero
