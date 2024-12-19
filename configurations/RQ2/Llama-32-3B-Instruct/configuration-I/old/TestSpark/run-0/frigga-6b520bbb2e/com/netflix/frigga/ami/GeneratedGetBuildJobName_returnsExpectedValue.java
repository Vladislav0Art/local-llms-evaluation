package com.netflix.frigga.ami;

public class GeneratedGetBuildJobName_returnsExpectedValue {

    @Test
    public void getBuildJobName_returnsExpectedValue() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals("expectedBuildJob", appVersion.getBuildJobName());
    }

}