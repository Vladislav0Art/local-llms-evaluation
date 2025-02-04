package com.netflix.frigga.ami;

public class GeneratedValidAppVersionShouldParseCorrectly {

    @Test
    public void validAppVersionShouldParseCorrectly() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertNotNull(appVersion);
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0-586499", appVersion.getVersion());
    }

}