package com.netflix.frigga.ami;

public class GeneratedTestEqualsNull {

    @Test
    public void testEqualsNull() {
        // Arrange
        String amiName1 = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.equals(null);
        assertTrue(expected);
    }

}