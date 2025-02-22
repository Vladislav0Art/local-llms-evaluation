package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private static final String TEST_STRING = "test";

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.version = TEST_STRING;
        String actual = appVersion.getVersion();
        assertEquals(TEST_STRING, actual);
    }

}