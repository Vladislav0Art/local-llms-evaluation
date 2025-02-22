package com.netflix.frigga.ami;

public class GeneratedTestParseNameNullInput {

    @Test
    public void testParseNameNullInput() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}