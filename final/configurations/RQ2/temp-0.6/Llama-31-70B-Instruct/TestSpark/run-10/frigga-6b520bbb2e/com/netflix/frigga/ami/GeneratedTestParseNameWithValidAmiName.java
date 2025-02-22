package com.netflix.frigga.ami;

public class GeneratedTestParseNameWithValidAmiName {

    private static final String TEST_STRING = "test";

    @Test
    public void testParseNameWithValidAmiName() {
        AppVersion actual = AppVersion.parseName(TEST_STRING);
        assertNotNull(actual);
        assertEquals(TEST_STRING, actual.getPackageName());
    }

}