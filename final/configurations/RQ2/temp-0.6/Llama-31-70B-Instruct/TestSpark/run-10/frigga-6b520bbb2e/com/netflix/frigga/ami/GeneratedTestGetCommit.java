package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    private static final String TEST_STRING = "test";

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.commit = TEST_STRING;
        String actual = appVersion.getCommit();
        assertEquals(TEST_STRING, actual);
    }

}