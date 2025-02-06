package com.netflix.frigga.ami;

public class GeneratedCompareTo_[SameAppVersion]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void compareTo_[ SameAppVersion]Test() {
        appVersion = new AppVersion("1.0");
        AppVersion other = new AppVersion("1.0");
        int result = appVersion.compareTo(other);
        assertEquals(0, result);
    }

}