package com.netflix.frigga.ami;

public class GeneratedParseName_ValidName_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidName_ReturnsParsedAppVersion() {
        String amiName = "1.2.3-1234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("1", appVersion.getVersion());
        assertEquals("2", appVersion.getBuildNumber());
        assertEquals("3", appVersion.getCommit());
    }

}