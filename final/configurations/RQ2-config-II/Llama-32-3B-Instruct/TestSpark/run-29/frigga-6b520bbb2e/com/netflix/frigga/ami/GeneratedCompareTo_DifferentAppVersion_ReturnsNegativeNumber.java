package com.netflix.frigga.ami;

public class GeneratedCompareTo_DifferentAppVersion_ReturnsNegativeNumber {

    @Test
    public void compareTo_DifferentAppVersion_ReturnsNegativeNumber() {
        AppVersion appVersion1 = new AppVersion("1.2.3-1234567890");
        AppVersion appVersion2 = new AppVersion("1.2.4-1234567890");
        assertLessThan(0, appVersion1.compareTo(appVersion2));
    }

}