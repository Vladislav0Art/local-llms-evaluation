package com.netflix.frigga.ami;

public class GeneratedGetVersion_ValidAppVersion_ReturnsVersion {

    @Test
    public void getVersion_ValidAppVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion("1.2.3-1234567890");
        assertEquals("2", appVersion.getVersion());
    }

}