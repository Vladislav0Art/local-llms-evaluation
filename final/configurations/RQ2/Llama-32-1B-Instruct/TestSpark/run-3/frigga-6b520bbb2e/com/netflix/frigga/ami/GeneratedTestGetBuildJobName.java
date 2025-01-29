package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    private AppVersion appVersion;

    @Test
    public void testGetBuildJobName() {
        appVersion = AppVersion.create("build-job-name-1");
        assertNotNull(appVersion.getBuildJobName());
        assertEquals(AppVersion.getBuildJobName(), appVersion.getBuildJobName());
    }

}