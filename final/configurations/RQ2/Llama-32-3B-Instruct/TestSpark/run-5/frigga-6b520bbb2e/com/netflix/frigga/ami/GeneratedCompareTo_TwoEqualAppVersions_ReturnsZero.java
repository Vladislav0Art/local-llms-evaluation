package com.netflix.frigga.ami;

public class GeneratedCompareTo_TwoEqualAppVersions_ReturnsZero {

    @Test
    public void compareTo_TwoEqualAppVersions_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(0, result);
    }

}