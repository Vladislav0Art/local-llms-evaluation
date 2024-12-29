package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    private AppVersion appVersion;

    @Test
    public void testParseName() {
        String amiName = "ami-name";
        appVersion = AppVersion.parseName(amiName);
        assertEquals("ami-name", appVersion.getPackageName());
    }

}