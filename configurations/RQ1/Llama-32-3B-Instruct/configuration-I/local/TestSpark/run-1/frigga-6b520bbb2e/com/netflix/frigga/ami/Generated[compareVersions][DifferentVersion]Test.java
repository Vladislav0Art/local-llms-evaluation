package com.netflix.frigga.ami;

public class Generated[compareVersions][DifferentVersion]

Test {

    private AppVersion appVersion;

    @Test
    public void [compareVersions][DifferentVersion]Test() {
        AppVersion version1 = new AppVersion();
        version1.packageName = "subscriberha";
        version1.version = "1.0.0-586499";
        AppVersion version2 = new AppVersion();
        version2.packageName = "subscriberha";
        version2.version = "1.0.0-586500";
        assertEquals(-1, version1.compareTo(version2));
    }

}