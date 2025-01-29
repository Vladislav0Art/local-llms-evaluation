package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    private AppVersion appVersion;

    @Test
    public void testGetPackageName() {
        appVersion = AppVersion.create("my-app-name");
        assertEquals(AppVersion.getPackageName(), appVersion.getName());
    }

}