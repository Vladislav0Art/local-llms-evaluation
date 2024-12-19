package com.netflix.frigga.ami;

public class GeneratedParseName_MultipleSpacesAndNewline {

    @Test
    public void parseName_MultipleSpacesAndNewline() {
        String amiName = "appversion tag   1.0\n";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

}