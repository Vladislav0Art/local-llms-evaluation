package com.netflix.frigga.ami;

public class GeneratedTestParseNameWithInvalidPattern {

    @Test
    public void testParseNameWithInvalidPattern() {
        String amiName = "invalid";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}