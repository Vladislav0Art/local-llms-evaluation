package com.netflix.frigga.ami;

public class GeneratedTestParseNameNoPatternFound {

    private AppVersion appVersion;

    @Test
    public void testParseNameNoPatternFound() {
        String amiName = "ami";
        appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion.getPackageName());
    }

}