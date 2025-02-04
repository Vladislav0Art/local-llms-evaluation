package com.netflix.frigga.ami;

public class GeneratedParseName_GivenValidAmiString_ReturnsParsedAppVersion {

    @Test
    public void parseName_GivenValidAmiString_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedAppVersion.packageName);
        assertEquals("1.0.0-586499", parsedAppVersion.version);
    }

}