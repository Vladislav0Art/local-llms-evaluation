package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    private static final String TEST_STRING = "test";

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.buildJobName = TEST_STRING;
        String actual = appVersion.getBuildJobName();
        assertEquals(TEST_STRING, actual);
    }

}