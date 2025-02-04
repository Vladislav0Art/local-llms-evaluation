package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_ReturnsBuildNumber {

    @Test
    public void getBuildNumber_ReturnsBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("12345");
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("12345", buildNumber);
    }

}