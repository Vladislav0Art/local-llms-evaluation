package com.netflix.frigga.ami;

public class GeneratedParseName_returnsParsedAppVersion {

    private final static Matcher matcher = AppVersion.APP_VERSION_PATTERN.matcher("subscriberha-1.0.0-586499");

    @Test
    public void parseName_returnsParsedAppVersion() {
        // Given: amiName is "subscriberha-1.0.0-586499"
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.packageName);
        assertEquals("1.0.0-586499", parsedName.version);
    }

}