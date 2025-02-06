package com.netflix.frigga.ami;

public class GeneratedHashCode_[SameAppVersion]

Test {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void hashCode_[ SameAppVersion]Test() {
        appVersion = new AppVersion("1.0");
        int hash1 = appVersion.hashCode();
        appVersion = new AppVersion("1.0");
        int hash2 = appVersion.hashCode();
        assertEquals(hash1, hash2);
    }

}