package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.buildJobName = "buildJobName";
        assertEquals("buildJobName", appVersion.getBuildJobName());
    }

}