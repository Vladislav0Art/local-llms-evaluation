package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

        // Act
        AppVersion actual = new AppVersion();
        expected = actual.getBuildJobName();
        assertEquals(amiName, expected);
    }

}