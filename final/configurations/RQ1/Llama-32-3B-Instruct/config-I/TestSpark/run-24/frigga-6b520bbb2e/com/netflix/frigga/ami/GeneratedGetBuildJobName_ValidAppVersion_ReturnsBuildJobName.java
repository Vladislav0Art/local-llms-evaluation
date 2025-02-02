package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_ValidAppVersion_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ValidAppVersion_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.buildJobName = "jenkins-job-name";
        assertEquals("jenkins-job-name", appVersion.getBuildJobName());
    }

}