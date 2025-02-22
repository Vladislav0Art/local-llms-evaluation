package com.netflix.frigga.ami;

public class GeneratedTestParseName_null {

    @Test
    public void testParseName_null() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

}