package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_DivideBySpace {

    @Test
    public void getBuildNumber_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getBuildNumber());
    }

}