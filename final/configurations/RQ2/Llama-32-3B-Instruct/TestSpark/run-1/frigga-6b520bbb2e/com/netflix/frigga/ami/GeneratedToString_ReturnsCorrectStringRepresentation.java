package com.netflix.frigga.ami;

public class GeneratedToString_ReturnsCorrectStringRepresentation {

    @Test
    public void toString_ReturnsCorrectStringRepresentation() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String stringRepresentation = appVersion.toString();

        // Assert
        assertTrue(stringRepresentation.contains("1.0"));
        assertTrue(stringRepresentation.contains("ami-1234"));
    }

}