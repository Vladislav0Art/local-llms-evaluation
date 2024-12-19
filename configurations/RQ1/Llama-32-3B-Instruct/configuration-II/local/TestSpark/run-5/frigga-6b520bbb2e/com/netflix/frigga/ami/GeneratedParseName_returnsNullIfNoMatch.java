package com.netflix.frigga.ami;

public class GeneratedParseName_returnsNullIfNoMatch {

    private final static Matcher matcher = AppVersion.APP_VERSION_PATTERN.matcher("subscriberha-1.0.0-586499");

    @Test
    public void parseName_returnsNullIfNoMatch() {
        // Given: amiName is "no-match"
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}