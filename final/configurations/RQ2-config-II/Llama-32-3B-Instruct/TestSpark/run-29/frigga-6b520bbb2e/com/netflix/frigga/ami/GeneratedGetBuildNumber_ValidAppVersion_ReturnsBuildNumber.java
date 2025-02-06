package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_ValidAppVersion_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ValidAppVersion_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion("1.2.3-1234567890");
        assertEquals("3", appVersion.getBuildNumber());
    }

}