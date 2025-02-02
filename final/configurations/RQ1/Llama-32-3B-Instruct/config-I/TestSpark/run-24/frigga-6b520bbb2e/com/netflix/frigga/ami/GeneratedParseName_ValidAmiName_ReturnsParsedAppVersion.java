package com.netflix.frigga.ami;

public class GeneratedParseName_ValidAmiName_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidAmiName_ReturnsParsedAppVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertEquals("subscriberha", parsedAppVersion.packageName);
        assertEquals("1.0.0", parsedAppVersion.version);
    }

}