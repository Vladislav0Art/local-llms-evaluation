package com.netflix.frigga.ami;

public class GeneratedGetVersion_ValidAppVersion_ReturnsVersion {

    @Test
    public void getVersion_ValidAppVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.version = "1.0.0";
        assertEquals("1.0.0", appVersion.getVersion());
    }

}