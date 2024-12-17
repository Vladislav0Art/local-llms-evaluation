package com.netflix.frigga.ami;

public class GeneratedTestNullBuildNumber_ThrowsNullPointerException {

    @Test
    public void testNullBuildNumber_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber(null);
        assertThrows(NullPointerException.class, () -> appVersion.getBuildNumber());
    }

}