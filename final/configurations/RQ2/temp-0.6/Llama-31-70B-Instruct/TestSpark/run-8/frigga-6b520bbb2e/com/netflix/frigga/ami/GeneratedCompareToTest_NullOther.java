package com.netflix.frigga.ami;

public class GeneratedCompareToTest_NullOther {

    private AppVersion appVersion;
    private String amiName;

    @Test
    public void compareToTest_NullOther() {
        // Arrange
        appVersion = new AppVersion();
        other = null;

        // Act
        int result = appVersion.compareTo(other);

        // Assert
        assertEquals(1, result);
    }

}