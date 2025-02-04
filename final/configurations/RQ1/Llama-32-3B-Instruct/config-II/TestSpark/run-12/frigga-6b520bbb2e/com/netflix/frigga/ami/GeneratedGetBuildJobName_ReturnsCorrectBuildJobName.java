package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_ReturnsCorrectBuildJobName {

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("subscriberha", appVersion.getBuildJobName());
    }

}