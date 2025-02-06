package com.netflix.frigga.ami;

public class GeneratedHashCode ReturnsUniqueHashCodeForEachAppVersion {

    @Test
    public void hashCode

    ReturnsUniqueHashCodeForEachAppVersion() {
        // Note: This test is not fully comprehensive, as generating unique hash codes for all possible app versions would be computationally expensive.
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}