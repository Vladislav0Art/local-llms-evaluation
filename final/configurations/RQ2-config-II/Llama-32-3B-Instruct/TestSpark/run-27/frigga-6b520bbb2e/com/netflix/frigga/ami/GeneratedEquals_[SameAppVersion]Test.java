package com.netflix.frigga.ami;

public class GeneratedEquals_[SameAppVersion]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void equals_[ SameAppVersion]Test() {
        appVersion = new AppVersion("1.0");
        boolean result = appVersion.equals(appVersion);
        assertTrue(result);
    }

}