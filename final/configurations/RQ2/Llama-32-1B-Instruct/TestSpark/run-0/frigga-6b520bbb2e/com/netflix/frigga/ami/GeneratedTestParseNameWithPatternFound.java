package com.netflix.frigga.ami;

public class GeneratedTestParseNameWithPatternFound {

    private AppVersion appVersion;

    @Test
    public void testParseNameWithPatternFound() {
        String pattern = "pattern-name";
        appVersion = AppVersion.parseName(pattern);
        assertNotNull(appVersion.getPackageName());
    }

}