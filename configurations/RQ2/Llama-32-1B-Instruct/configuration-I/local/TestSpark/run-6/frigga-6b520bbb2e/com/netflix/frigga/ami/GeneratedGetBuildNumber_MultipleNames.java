package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_MultipleNames {

    @Test
    public void getBuildNumber_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getBuildNumber());
    }

}