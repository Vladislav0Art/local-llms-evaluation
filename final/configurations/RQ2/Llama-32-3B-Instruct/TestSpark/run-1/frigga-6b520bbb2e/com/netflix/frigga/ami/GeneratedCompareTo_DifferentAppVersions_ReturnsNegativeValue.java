package com.netflix.frigga.ami;

public class GeneratedCompareTo_DifferentAppVersions_ReturnsNegativeValue {

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeValue() {
        // Arrange
        AppVersion appVersion1 = new AppVersion("1.0", "ami-1234");
        AppVersion appVersion2 = new AppVersion("2.0", "ami-5678");

        // Act
        int comparisonResult = appVersion1.compareTo(appVersion2);

        // Assert
        assertTrue(comparisonResult < 0);
    }

}