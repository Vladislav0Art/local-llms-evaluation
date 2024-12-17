package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNameNotPresent {

    @Test
    public void testGetPackageNameNotPresent() {
        // Arrange
        AppVersion appVersion = new AppVersion();

        // Act and Assert
        assertEquals("", appVersion.getPackageName());
    }

}