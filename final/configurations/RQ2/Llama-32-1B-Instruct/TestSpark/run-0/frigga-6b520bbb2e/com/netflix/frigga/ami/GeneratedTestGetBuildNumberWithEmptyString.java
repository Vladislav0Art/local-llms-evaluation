package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumberWithEmptyString {

    private AppVersion appVersion;

    @Test
    public void testGetBuildNumberWithEmptyString() {
        appVersion = new AppVersion();
        assertEquals("", appVersion.getBuildNumber());
    }

}