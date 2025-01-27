package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_ReturnsExpectedJobName {

    @Test
    public void getBuildJobName_ReturnsExpectedJobName() {
        String buildJobName = AppVersion.getBuildJobName();
        assertNotNull(buildJobName);
        assertTrue(buildJobName.length() > 0);
    }

}