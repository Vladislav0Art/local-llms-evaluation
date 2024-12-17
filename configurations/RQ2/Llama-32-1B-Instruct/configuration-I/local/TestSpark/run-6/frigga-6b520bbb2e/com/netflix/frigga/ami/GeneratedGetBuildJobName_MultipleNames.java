package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_MultipleNames {

    @Test
    public void getBuildJobName_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("Jenkins Job Name", appVersion.getBuildJobName());
    }

}