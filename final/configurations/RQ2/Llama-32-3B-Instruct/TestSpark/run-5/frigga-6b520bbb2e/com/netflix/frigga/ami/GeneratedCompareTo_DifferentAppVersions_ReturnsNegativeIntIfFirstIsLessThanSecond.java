package com.netflix.frigga.ami;

public class GeneratedCompareTo_DifferentAppVersions_ReturnsNegativeIntIfFirstIsLessThanSecond {

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeIntIfFirstIsLessThanSecond() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("my-ami-0");
        int result = appVersion1.compareTo(appVersion2);
        assertNotEquals(0, result);
    }

}