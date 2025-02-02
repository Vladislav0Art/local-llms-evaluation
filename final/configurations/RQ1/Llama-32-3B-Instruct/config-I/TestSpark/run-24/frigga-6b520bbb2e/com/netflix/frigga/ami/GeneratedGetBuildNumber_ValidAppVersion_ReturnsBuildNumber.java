package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_ValidAppVersion_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ValidAppVersion_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.buildNumber = "build-number";
        assertEquals("build-number", appVersion.getBuildNumber());
    }

}