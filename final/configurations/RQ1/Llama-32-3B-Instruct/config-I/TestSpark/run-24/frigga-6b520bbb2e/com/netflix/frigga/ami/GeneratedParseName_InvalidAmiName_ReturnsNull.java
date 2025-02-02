package com.netflix.frigga.ami;

public class GeneratedParseName_InvalidAmiName_ReturnsNull {

    @Test
    public void parseName_InvalidAmiName_ReturnsNull() {
        String amiName = "invalid-ami-name";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}