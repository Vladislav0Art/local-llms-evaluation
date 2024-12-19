package com.netflix.frigga.ami;

public class GeneratedGetVersion_NoSpaces {

    @Test
    public void getVersion_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getVersion());
    }

}