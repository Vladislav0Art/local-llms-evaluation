package com.netflix.frigga.ami;

public class GeneratedParseName_GivenInvalidAmiString_ReturnsNull {

    @Test
    public void parseName_GivenInvalidAmiString_ReturnsNull() {
        String amiName = "invalid";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}