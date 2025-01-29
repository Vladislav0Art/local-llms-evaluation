package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private AppVersion appVersion;

    @Test
    public void testGetVersion() {
        appVersion = AppVersion.create("1.0.0");
        assertNotNull(appVersion.getVersion());
        assertEquals(1, appVersion.getVersion().split("\\.")[0].length());
    }

}