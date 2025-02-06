package com.netflix.frigga.ami;

public class GeneratedParseName_[ValidString]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void parseName_[ ValidString]Test() {
        amiName = "1.0";
        appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}