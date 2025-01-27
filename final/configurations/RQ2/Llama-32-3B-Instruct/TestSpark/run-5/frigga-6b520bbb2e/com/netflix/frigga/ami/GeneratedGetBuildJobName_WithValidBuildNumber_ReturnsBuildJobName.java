package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_WithValidBuildNumber_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_WithValidBuildNumber_ReturnsBuildJobName() {
        String buildJobName = "my-build-job-name";
        String amiName = "my-ami-" + buildJobName;
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals(buildJobName, appVersion.getBuildJobName());
    }

}