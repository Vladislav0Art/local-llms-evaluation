package com.netflix.frigga.ami;

public class GeneratedTestCompareTo_Null {

    private static final String APP_VERSION_STRING = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = AppVersion.parseName(APP_VERSION_STRING);
    }

    @Test
    public void testCompareTo_Null() {
        assertEquals(1, appVersion.compareTo(null));
    }

}