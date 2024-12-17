package com.netflix.frigga.ami;

public class Generated[compareVersions][SameVersion]

Test {

    private AppVersion appVersion;

    @Test
    public void [compareVersions][SameVersion]Test() {
        AppVersion version1 = new AppVersion();
        version1.packageName = "subscriberha";
        version1.version = "1.0.0-586499";
        AppVersion version2 = new AppVersion();
        version2.packageName = "subscriberha";
        version2.version = "1.0.0-586499";
        assertEquals(0, version1.compareTo(version2));
    }

}