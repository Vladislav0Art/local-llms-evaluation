package com.netflix.frigga.ami;

public class GeneratedHashCode_ReturnsCorrectHashCode {

    @Test
    public void hashCode_ReturnsCorrectHashCode() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        int hash = appVersion.hashCode();

        // Assert
        assertTrue(hash != 0);
    }

}