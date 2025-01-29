package com.netflix.frigga.ami;

public class GeneratedTestEquals {

    private AppVersion appVersion;

    @Test
    public void testEquals() {
        appVersion = AppVersion.create("my-app-name");
        assertTrue(appVersion.equals(AppVersion.getPackageName()));
        assertFalse(appVersion.equals("other-ami-name"));
    }

}