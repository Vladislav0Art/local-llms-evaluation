package com.netflix.frigga.ami;

public class GeneratedTestParseNameWithNullAmiName {

    private static final String TEST_STRING = "test";

    @Test
    public void testParseNameWithNullAmiName() {
        AppVersion actual = AppVersion.parseName(null);
        assertNull(actual);
    }

}