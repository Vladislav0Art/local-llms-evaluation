package com.netflix.frigga.ami;

public class GeneratedGetPackageName_NoSpaces {

    @Test
    public void getPackageName_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("RPM", appVersion.getPackageName());
    }

}