package com.netflix.frigga.ami;

public class GeneratedParseName_NullAmiName_ReturnsNull {

    @Test
    public void parseName_NullAmiName_ReturnsNull() {
        String amiName = null;
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}