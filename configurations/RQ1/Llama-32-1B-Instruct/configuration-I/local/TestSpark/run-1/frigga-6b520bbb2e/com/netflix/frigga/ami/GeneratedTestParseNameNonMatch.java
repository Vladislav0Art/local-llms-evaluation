package com.netflix.frigga.ami;

public class GeneratedTestParseNameNonMatch {

    @Test
    public void testParseNameNonMatch() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion expected = parseName(amiName);

        // Act
        AppVersion actual = new AppVersion();
        actual.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

}