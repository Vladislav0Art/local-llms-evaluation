package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("test-build-job-name");
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("test-build-job-name", buildJobName);
    }

}