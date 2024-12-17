package com.netflix.frigga.ami;

public class GeneratedTestParseNameNull {

    @Test
    public void testParseNameNull() {
        // Arrange
        String amiName = null;
        AppVersion expected = parseName(amiName);

        // Act
        AppVersion actual = new AppVersion();
        actual.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

}