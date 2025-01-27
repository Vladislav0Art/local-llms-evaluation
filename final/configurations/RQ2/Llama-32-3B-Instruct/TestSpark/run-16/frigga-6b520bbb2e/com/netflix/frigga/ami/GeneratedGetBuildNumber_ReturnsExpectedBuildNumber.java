package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_ReturnsExpectedBuildNumber {

    @Test
    public void getBuildNumber_ReturnsExpectedBuildNumber() {
        String buildNumber = AppVersion.getBuildNumber();
        assertNotNull(buildNumber);
        assertTrue(buildNumber.length() > 0);
    }

}