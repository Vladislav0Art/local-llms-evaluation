package com.netflix.frigga.ami;

public class GeneratedCompareTo_DifferentBuildNumbersReturnsPositiveInt {

    @Test
    public void compareTo_DifferentBuildNumbersReturnsPositiveInt() {
        AppVersion appVersion1 = new AppVersion("build1", "version1");
        AppVersion appVersion2 = new AppVersion("build2", "version2");
        int result = appVersion1.compareTo(appVersion2);
        assertTrue(result > 0);
    }

}