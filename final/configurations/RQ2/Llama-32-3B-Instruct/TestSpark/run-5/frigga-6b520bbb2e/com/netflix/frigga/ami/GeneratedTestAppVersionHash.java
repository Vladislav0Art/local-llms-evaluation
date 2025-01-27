package com.netflix.frigga.ami;

public class GeneratedTestAppVersionHash {

    @Test
    public void testAppVersionHash() {
        AppVersion appVersion1 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");
        AppVersion appVersion2 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");

        int hash1 = appVersion1.hashCode();
        int hash2 = appVersion2.hashCode();

        assertEquals(hash1, hash2);
    }

}