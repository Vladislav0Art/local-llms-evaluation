package com.netflix.frigga.ami;

public class GeneratedTestAppVersionEquals {

    @Test
    public void testAppVersionEquals() {
        AppVersion appVersion1 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");
        AppVersion appVersion2 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");

        assertTrue(appVersion1.equals(appVersion2));
    }

}