package com.netflix.frigga.ami;

public class GeneratedTestAppVersionWithInvalidVersion {

    @Test
    public void testAppVersionWithInvalidVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("com.example.package");

        assertEquals("com.example.package", appVersion.getPackageName());

        assertNull(appVersion.parseName(""));
        assertNotNull(appVersion.parseName("subscriberha/invalid-version"));
    }

}