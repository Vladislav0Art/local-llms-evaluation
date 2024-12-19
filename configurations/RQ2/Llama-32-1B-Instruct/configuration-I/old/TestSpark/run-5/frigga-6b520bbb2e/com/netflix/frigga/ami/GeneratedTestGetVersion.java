package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        String amiName = "ami-1234567890abcdef";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1.2.3", appVersion.getVersion());
    }

}