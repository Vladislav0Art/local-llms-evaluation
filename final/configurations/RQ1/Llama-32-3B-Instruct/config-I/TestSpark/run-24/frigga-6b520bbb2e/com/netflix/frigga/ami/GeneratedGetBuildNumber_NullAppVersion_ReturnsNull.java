package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_NullAppVersion_ReturnsNull {

    @Test
    public void getBuildNumber_NullAppVersion_ReturnsNull() {
        AppVersion appVersion = null;
        assertNull(appVersion.getBuildNumber());
    }

}