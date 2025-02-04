package com.netflix.frigga.ami;

public class GeneratedParseName_GivenAminull_ReturnsNull {

    @Test
    public void parseName_GivenAminull_ReturnsNull() {
        String amiName = null;
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}