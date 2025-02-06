package com.netflix.frigga.ami;

public class GeneratedParseName_ValidAmiName_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidAmiName_ReturnsParsedAppVersion() {
        String amiName = "my-ami-name";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
    }

}