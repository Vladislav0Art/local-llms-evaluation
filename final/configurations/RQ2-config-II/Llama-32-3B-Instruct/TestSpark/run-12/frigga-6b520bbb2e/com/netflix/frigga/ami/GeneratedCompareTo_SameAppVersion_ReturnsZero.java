package com.netflix.frigga.ami;

public class GeneratedCompareTo_SameAppVersion_ReturnsZero {

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertEquals(0, comparisonResult);
    }

}