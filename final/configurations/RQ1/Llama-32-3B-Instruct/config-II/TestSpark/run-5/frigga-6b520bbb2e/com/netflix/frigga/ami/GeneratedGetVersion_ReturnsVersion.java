package com.netflix.frigga.ami;

public class GeneratedGetVersion_ReturnsVersion {

    @Test
    public void getVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        String version = appVersion.getVersion();
        assertEquals("1.0.0", version);
    }

}