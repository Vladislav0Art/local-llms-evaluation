package com.netflix.frigga.ami;

public class GeneratedTestParseNameMatch {

    @Test
    public void testParseNameMatch() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion expected = parseName(amiName);

        // Act
        AppVersion actual = new AppVersion();
        actual.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

}