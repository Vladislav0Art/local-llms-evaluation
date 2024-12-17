package com.netflix.frigga.ami;

public class GeneratedCompareTo_differentVersionsReturnsNegativeResult {

    @Test
    public void compareTo_differentVersionsReturnsNegativeResult() {
        AppVersion appVersion1 = new AppVersion(123);
        AppVersion appVersion2 = new AppVersion(456);
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}