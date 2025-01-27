package com.netflix.frigga.ami;

public class GeneratedCompareTo_SameAppVersionReturnsZero {

    @Test
    public void compareTo_SameAppVersionReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

}