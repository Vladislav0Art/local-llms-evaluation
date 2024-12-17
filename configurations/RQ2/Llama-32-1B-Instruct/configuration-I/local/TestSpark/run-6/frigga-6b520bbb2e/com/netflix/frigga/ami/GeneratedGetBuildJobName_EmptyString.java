package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_EmptyString {

    @Test
    public void getBuildJobName_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getBuildJobName());
    }

}