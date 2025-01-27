package com.netflix.frigga.ami;

public class GeneratedParseName_WithValidFormat_ReturnsParsedAppVersion {

    @Test
    public void parseName_WithValidFormat_ReturnsParsedAppVersion() {
        String amiName = "my-ami-0";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertEquals(amiName, parsedAppVersion.getVersion());
    }

}