package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionPattern {

    private static final String TEST_STRING = "test";

    @Test
    public void testGetAppVersionPattern() {
        Pattern actual = AppVersion.getAppVersionPattern();
        assertNotNull(actual);
    }

}