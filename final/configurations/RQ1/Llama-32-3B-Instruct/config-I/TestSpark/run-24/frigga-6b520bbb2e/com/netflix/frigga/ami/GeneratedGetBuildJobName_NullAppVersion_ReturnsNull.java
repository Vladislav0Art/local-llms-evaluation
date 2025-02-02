package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_NullAppVersion_ReturnsNull {

    @Test
    public void getBuildJobName_NullAppVersion_ReturnsNull() {
        AppVersion appVersion = null;
        assertNull(appVersion.getBuildJobName());
    }

}