package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_NoSpaces {

    @Test
    public void getBuildJobName_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("Jenkins Job Name", appVersion.getBuildJobName());
    }

}