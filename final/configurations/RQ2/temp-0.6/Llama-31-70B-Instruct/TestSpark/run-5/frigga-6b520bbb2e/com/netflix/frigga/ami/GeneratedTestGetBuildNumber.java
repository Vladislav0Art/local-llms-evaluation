package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.buildNumber = "buildNumber";
        assertEquals("buildNumber", appVersion.getBuildNumber());
    }

}