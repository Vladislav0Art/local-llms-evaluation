package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    private static final String TEST_STRING = "test";

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.packageName = TEST_STRING;
        String actual = appVersion.getPackageName();
        assertEquals(TEST_STRING, actual);
    }

}