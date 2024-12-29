package com.netflix.frigga.ami;

public class GeneratedGetPackageName ReturnsPackageName {

    @Test
    public void getPackageName

    ReturnsPackageName() {
        // Arrange
        AppVersion appVersion = new AppVersion("1.0", "ami-1234");

        // Act
        String packageName = appVersion.getPackageName();

        // Assert
        assertEquals("ami", packageName);
    }

}