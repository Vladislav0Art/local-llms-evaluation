package com.netflix.frigga.ami;

public class GeneratedParseName_MatchFound_ReturnsParsedAppVersion {

    @Test
    public void parseName_MatchFound_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
    }

}