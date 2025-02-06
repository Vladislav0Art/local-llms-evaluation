package com.netflix.frigga.ami;

public class GeneratedCompareTo_SameAppVersion_ReturnsZero {

    @Test
    public void compareTo_SameAppVersion_ReturnsZero() {
        AppVersion appVersion1 = new AppVersion("1.2.3-1234567890");
        AppVersion appVersion2 = new AppVersion("1.2.3-1234567890");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}