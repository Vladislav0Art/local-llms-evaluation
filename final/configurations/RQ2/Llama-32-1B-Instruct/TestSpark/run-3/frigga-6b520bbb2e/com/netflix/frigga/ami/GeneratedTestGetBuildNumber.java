package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    private AppVersion appVersion;

    @Test
    public void testGetBuildNumber() {
        appVersion = AppVersion.create("build-number-1234");
        assertNotNull(appVersion.getBuildNumber());
        assertEquals(1234, appVersion.getBuildNumber().length());
    }

}