package com.netflix.frigga.ami;

public class GeneratedCompareTo_sameVersionsReturnsZero {

    @Test
    public void compareTo_sameVersionsReturnsZero() {
        AppVersion appVersion1 = new AppVersion(123);
        AppVersion appVersion2 = new AppVersion(123);
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}