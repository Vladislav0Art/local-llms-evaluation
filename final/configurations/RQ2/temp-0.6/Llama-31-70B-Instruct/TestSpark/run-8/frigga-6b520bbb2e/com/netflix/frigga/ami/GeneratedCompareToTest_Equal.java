package com.netflix.frigga.ami;

public class GeneratedCompareToTest_Equal {

    private AppVersion appVersion;
    private String amiName;

    @Test
    public void compareToTest_Equal() {
        // Arrange
        appVersion = new AppVersion();
        other = appVersion;

        // Act
        int result = appVersion.compareTo(other);

        // Assert
        assertEquals(0, result);
    }

}