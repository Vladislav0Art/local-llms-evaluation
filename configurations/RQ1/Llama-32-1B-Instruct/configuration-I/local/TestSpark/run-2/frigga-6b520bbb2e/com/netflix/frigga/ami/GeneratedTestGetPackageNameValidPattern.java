package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNameValidPattern {

    @Test
    public void testGetPackageNameValidPattern() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";

        // Act
        AppVersion parsedName = AppVersion.parseName(amiName);

        // Assert
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
    }

}