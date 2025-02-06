package com.netflix.frigga.ami;

public class GeneratedGetBuildNumber_ReturnsCorrectBuildNumber {

    @Test
    public void getBuildNumber_ReturnsCorrectBuildNumber() {
        String amiName = "my-ami-name-1234";
        assertEquals("1234", AppVersion.parseName(amiName).getBuildNumber());
    }

}