package com.netflix.frigga.ami;

public class GeneratedHashCode_returnsUniqueHashCodeForSameAppVersion {

    @Test
    public void hashCode_returnsUniqueHashCodeForSameAppVersion() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}