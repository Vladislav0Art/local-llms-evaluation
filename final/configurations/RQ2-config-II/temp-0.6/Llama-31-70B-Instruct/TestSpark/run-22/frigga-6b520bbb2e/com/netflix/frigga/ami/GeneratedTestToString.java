package com.netflix.frigga.ami;

public class GeneratedTestToString {

    private static final String APP_VERSION_STRING = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = AppVersion.parseName(APP_VERSION_STRING);
    }

    @Test
    public void testToString() {
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=WE-WAPP-subscriberha, buildNumber=150, changelist=h150]", appVersion.toString());
    }

}