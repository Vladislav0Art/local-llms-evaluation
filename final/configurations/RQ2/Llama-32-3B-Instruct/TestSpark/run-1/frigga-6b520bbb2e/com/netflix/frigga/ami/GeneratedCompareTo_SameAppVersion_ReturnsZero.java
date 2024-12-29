package com.netflix.frigga.ami;

public class GeneratedCompareTo_SameAppVersion_ReturnsZero {

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        // Arrange
        AppVersion appVersion1 = new AppVersion("1.0", "ami-1234");
        AppVersion appVersion2 = new AppVersion("1.0", "ami-1234");

        // Act
        int comparisonResult = appVersion1.compareTo(appVersion2);

        // Assert
        assertEquals(0, comparisonResult);
    }

}