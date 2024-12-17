package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber {

    @Test
    public void testGetBuildNumber() {
        String amiName = "ami-1234567890abcdef";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1.2.3", appVersion.getVersion());
    }

}