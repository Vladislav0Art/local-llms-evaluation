package com.netflix.frigga.ami;

public class GeneratedParseName_WithInvalidFormat_ReturnsNull {

    @Test
    public void parseName_WithInvalidFormat_ReturnsNull() {
        String amiName = "invalid-ami-name";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}