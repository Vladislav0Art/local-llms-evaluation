package com.netflix.frigga.ami;

public class GeneratedTestParseNameWithNull {

    @Test
    public void testParseNameWithNull() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

}