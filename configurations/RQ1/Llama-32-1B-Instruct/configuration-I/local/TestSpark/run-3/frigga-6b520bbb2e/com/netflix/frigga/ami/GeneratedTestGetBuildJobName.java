package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    private static AppVersion appVersion1 = new AppVersion();
    private static AppVersion appVersion2 = new AppVersion();

    @Test
    public void testGetBuildJobName() throws Exception {
        assertEquals(null, getAppVersion().getBuildJobName());
    }

}