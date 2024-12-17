package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.getPackageName();
        assertEquals(amiName, expected);
    }

}