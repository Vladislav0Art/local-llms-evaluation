package com.netflix.frigga.ami;

public class GeneratedTestNullBuildJobName_ThrowsNullPointerException {

    @Test
    public void testNullBuildJobName_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName(null);
        assertThrows(NullPointerException.class, () -> appVersion.getBuildJobName());
    }

}