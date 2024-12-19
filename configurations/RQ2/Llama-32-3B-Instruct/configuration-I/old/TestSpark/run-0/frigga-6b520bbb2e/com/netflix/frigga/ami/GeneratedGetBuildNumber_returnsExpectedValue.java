package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_returnsExpectedValue {

    @Test
    public void getBuildNumber_returnsExpectedValue() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals("expectedBuildNumber", appVersion.getBuildNumber());
    }

}