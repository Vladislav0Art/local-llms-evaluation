package com.netflix.frigga.ami;

public class GeneratedParseName_DivideBySpace {

    @Test
    public void parseName_DivideBySpace() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        String parsedVersion = appVersion.parseName(amiName);
        assertEquals("AppVersion", parsedVersion.getName());
    }

}