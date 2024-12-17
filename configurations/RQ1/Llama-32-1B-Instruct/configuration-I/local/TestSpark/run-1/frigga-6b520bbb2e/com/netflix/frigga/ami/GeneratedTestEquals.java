package com.netflix.frigga.ami;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        // Arrange
        String amiName1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        String amiName2 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual1 = new AppVersion();
        AppVersion actual2 = new AppVersion();
        expected = actual1.equals(actual2);
        assertTrue(expected);
    }

}