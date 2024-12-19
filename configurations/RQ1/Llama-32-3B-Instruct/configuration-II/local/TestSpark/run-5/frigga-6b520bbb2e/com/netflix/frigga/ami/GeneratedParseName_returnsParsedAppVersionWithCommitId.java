package com.netflix.frigga.ami;

public class GeneratedParseName_returnsParsedAppVersionWithCommitId {

    private final static Matcher matcher = AppVersion.APP_VERSION_PATTERN.matcher("subscriberha-1.0.0-586499");

    @Test
    public void parseName_returnsParsedAppVersionWithCommitId() {
        // Given: amiName is "subscriberha-1.0.0-586499.h150"
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("h150", parsedName.buildNumber);
    }

}