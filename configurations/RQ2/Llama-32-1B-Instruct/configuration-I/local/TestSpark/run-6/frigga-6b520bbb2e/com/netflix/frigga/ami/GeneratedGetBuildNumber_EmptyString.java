package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_EmptyString {

    @Test
    public void getBuildNumber_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getBuildNumber());
    }

}