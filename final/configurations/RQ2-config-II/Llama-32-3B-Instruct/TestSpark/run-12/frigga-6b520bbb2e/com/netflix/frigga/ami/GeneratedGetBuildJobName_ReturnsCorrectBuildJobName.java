package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_ReturnsCorrectBuildJobName {

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        String amiName = "my-ami-name-1234";
        assertEquals("1234", AppVersion.parseName(amiName).getBuildJobName());
    }

}