package com.netflix.frigga.ami;

public class Generated[

parseName_WithValidAppPattern_ReturnsParsedAppVersion {

    @Test
    public void [parseName_WithValidAppPattern_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName);
    }

}