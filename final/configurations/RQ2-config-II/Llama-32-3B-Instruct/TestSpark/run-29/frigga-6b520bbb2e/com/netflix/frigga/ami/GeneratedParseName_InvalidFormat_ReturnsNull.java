package com.netflix.frigga.ami;

public class GeneratedParseName_InvalidFormat_ReturnsNull {

    @Test
    public void parseName_InvalidFormat_ReturnsNull() {
        String amiName = "invalid-name";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}