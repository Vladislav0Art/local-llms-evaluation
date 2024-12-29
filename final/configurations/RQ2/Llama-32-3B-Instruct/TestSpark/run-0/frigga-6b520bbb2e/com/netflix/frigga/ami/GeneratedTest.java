package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void parseName_DifferentNames_ReturnsParsedAppVersion() {
        String amiName = "ami-abc123def456";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_MatchPattern_ReturnsParsedAppVersion() {
        String amiName = "ami-abcdefg-hijklmnopqrstuvwxyza";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_NoMatch_ReturnsNull() {
        String amiName = "ami-defghijklmno";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}