package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private AppVersion appVersion;

    @Test
    public void testGetVersion() {
        appVersion = new AppVersion();
        assertEquals("", appVersion.getVersion());
    }

}