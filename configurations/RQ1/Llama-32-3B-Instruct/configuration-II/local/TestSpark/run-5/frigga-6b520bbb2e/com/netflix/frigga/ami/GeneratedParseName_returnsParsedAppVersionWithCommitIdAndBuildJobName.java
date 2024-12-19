package com.netflix.frigga.ami;

public class GeneratedParseName_returnsParsedAppVersionWithCommitIdAndBuildJobName {

    private final static Matcher matcher = AppVersion.APP_VERSION_PATTERN.matcher("subscriberha-1.0.0-586499");

    @Test
    public void parseName_returnsParsedAppVersionWithCommitIdAndBuildJobName() {
        // Given: amiName is "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150"
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
        assertEquals("150", parsedName.buildNumber);
    }

}