package com.netflix.frigga.ami;

public class GeneratedGetPackageName_NullAppVersion_ReturnsNull {

    @Test
    public void getPackageName_NullAppVersion_ReturnsNull() {
        AppVersion appVersion = null;
        assertNull(appVersion.getPackageName());
    }

}