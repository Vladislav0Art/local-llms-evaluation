package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    private AppVersion appVersion;

    @Test
    public void testGetBuildNumber() {
        appVersion = new AppVersion();
        assertEquals("", appVersion.getBuildNumber());
    }

}