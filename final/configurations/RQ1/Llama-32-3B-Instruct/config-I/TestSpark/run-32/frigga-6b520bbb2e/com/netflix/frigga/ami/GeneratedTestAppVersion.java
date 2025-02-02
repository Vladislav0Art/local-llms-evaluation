package com.netflix.frigga.ami;

public class GeneratedTestAppVersion {

    @Test
    public void testAppVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("com.example.package");
        appVersion.setVersion("1.0.0-586499");

        assertEquals("com.example.package", appVersion.getPackageName());
        assertEquals("1.0.0-586499", appVersion.getVersion());

        assertNull(appVersion.parseName(""));
        assertNotNull(appVersion.parseName("subscriberha/1.0.0-586499"));
    }

}