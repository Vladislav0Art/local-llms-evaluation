package com.netflix.frigga.ami;

public class GeneratedTestParseName_InvalidPattern {

    @Test
    public void testParseName_InvalidPattern() {
        String amiName = "invalid-pattern";
        AppVersion version = AppVersion.parseName(amiName);
        assertNull(version);
    }

}