package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.version = "version";
        assertEquals("version", appVersion.getVersion());
    }

}