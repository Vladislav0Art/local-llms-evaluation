package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber_ThrowsNullPointerException {

    @Test
    public void testGetBuildNumber_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber(null);

        assertThrows(NullPointerException.class, () -> appVersion.getBuildNumber());
    }

}