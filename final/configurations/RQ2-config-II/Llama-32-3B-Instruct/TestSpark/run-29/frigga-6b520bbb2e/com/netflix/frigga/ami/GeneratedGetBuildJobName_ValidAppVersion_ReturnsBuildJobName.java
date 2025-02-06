package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_ValidAppVersion_ReturnsBuildJobName {

    @Test
    public void getBuildJobName_ValidAppVersion_ReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion("1.2.3-1234567890");
        assertNotNull(appVersion.getBuildJobName());
    }

}