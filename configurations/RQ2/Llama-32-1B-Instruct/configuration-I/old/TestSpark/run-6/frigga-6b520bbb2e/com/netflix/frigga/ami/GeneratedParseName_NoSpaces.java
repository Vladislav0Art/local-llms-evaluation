package com.netflix.frigga.ami;

public class GeneratedParseName_NoSpaces {

    @Test
    public void parseName_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

}