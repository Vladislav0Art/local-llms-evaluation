package com.netflix.frigga.ami;

public class GeneratedTestCompareToDifferentPackageName {

    @Test
    public void testCompareToDifferentPackageName() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.packageName = "subscriberha";
        appVersion1.version = "1.0.0";
        AppVersion appVersion2 = new AppVersion();
        appVersion2.packageName = "subscriberha2";
        appVersion2.version = "1.0.0";
        int comparison = appVersion1.compareTo(appVersion2);
        Assert.assertEquals(-1, comparison);
    }

}