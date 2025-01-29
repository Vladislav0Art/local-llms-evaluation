package com.netflix.frigga.ami;

public class GeneratedTestCompareByName_WithSpaces {

    @Test
    public void testCompareByName_WithSpaces() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        appVersion1.compareTo(appVersion2);
        assertEquals(0, AppVersion.compareNames("ami 1234567890abcdef", "ami 1234567890abcdef"));
    }

}