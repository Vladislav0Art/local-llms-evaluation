package com.netflix.frigga.ami;

public class GeneratedParseName_MultipleSpaces {

    @Test
    public void parseName_MultipleSpaces() {
        String amiName = "appversion tag   1.0";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

}