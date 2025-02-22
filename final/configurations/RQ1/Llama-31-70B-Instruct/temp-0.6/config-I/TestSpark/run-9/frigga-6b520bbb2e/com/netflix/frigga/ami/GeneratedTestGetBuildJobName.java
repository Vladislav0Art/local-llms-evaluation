package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("WE-WAPP-subscriberha");
        assertEquals("WE-WAPP-subscriberha", appVersion.getBuildJobName());
    }

}