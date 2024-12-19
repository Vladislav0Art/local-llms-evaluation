package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_NoSpaces {

    @Test
    public void getBuildNumber_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getBuildNumber());
    }

}