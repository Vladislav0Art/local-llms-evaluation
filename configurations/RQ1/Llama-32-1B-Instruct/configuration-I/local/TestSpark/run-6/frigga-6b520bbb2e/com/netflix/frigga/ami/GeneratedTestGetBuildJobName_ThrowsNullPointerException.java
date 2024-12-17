package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName_ThrowsNullPointerException {

    @Test
    public void testGetBuildJobName_ThrowsNullPointerException() {
        AppVersion appVersion = new AppVersion();
        appVersion.getBuildJobName();

        assertThrows(NullPointerException.class, () -> appVersion.getBuildJobName());
    }

}