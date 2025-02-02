package com.netflix.frigga.ami;

public class GeneratedGetVersion_NullAppVersion_ReturnsNull {

    @Test
    public void getVersion_NullAppVersion_ReturnsNull() {
        AppVersion appVersion = null;
        assertNull(appVersion.getVersion());
    }

}