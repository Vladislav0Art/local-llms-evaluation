package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("150");
        assertEquals("150", appVersion.getBuildNumber());
    }

}