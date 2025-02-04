package com.netflix.frigga.ami;

public class GeneratedGetPackageName_ReturnsPackageName {

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("test-package-name");
        String packageName = appVersion.getPackageName();
        assertEquals("test-package-name", packageName);
    }

}