package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ValidAppVersion_ReturnsPackageName {

    @Test
    public void getPackageName_ValidAppVersion_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.packageName = "subscriberha";
        assertEquals("subscriberha", appVersion.getPackageName());
    }

}