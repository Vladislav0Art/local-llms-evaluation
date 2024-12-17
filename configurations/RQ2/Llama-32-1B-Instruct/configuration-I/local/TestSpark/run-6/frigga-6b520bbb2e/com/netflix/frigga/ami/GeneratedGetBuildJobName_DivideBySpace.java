package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_DivideBySpace {

    @Test
    public void getBuildJobName_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("Jenkins Job Name", appVersion.getBuildJobName());
    }

}