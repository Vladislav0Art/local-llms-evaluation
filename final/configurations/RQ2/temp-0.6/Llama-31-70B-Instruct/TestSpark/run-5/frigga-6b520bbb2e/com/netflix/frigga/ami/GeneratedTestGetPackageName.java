package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.packageName = "packageName";
        assertEquals("packageName", appVersion.getPackageName());
    }

}