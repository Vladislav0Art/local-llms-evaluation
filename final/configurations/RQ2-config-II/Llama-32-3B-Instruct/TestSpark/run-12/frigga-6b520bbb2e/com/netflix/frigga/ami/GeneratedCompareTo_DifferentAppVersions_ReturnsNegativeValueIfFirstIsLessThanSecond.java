package com.netflix.frigga.ami;

public class GeneratedCompareTo_DifferentAppVersions_ReturnsNegativeValueIfFirstIsLessThanSecond {

    @Test
    public void compareTo_DifferentAppVersions_ReturnsNegativeValueIfFirstIsLessThanSecond() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion("my-version-2");
        int comparisonResult = appVersion1.compareTo(appVersion2);
        assertGreaterThan(0, comparisonResult);
    }

}