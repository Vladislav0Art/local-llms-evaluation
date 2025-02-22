package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    private static final String TEST_STRING = "test";

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.buildNumber = TEST_STRING;
        String actual = appVersion.getBuildNumber();
        assertEquals(TEST_STRING, actual);
    }

}