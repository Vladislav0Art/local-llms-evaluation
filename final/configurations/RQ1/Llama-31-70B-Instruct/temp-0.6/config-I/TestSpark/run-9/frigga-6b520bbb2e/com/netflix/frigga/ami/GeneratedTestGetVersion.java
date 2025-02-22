package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        assertEquals("1.0.0", appVersion.getVersion());
    }

}