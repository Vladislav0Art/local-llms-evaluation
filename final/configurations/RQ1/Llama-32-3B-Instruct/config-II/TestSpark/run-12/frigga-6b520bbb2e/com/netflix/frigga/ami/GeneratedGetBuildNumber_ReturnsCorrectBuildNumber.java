package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_ReturnsCorrectBuildNumber {

    @Test
    public void getBuildNumber_ReturnsCorrectBuildNumber() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertEquals("586499", appVersion.getBuildNumber());
    }

}