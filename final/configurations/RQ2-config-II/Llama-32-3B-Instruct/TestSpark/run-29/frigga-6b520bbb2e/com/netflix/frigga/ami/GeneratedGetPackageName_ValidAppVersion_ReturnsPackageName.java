package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ValidAppVersion_ReturnsPackageName {

    @Test
    public void getPackageName_ValidAppVersion_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion("1.2.3-1234567890");
        assertNotNull(appVersion.getPackageName());
    }

}