package com.netflix.frigga.ami;

public class GeneratedEquals_TwoSameAppVersionsReturnsTrue {

    @Test
    public void equals_TwoSameAppVersionsReturnsTrue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertTrue(appVersion1.equals(appVersion2));
    }

}