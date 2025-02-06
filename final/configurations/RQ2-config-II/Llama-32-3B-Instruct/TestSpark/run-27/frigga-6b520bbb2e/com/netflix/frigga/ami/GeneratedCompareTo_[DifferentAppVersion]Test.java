package com.netflix.frigga.ami;

public class GeneratedCompareTo_[DifferentAppVersion]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void compareTo_[ DifferentAppVersion]Test() {
        appVersion = new AppVersion("2.0");
        AppVersion other = new AppVersion("1.0");
        int result = appVersion.compareTo(other);
        assertTrue(result < 0);
    }

}