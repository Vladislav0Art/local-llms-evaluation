package com.netflix.frigga.ami;

public class GeneratedTestGetVersions {

    @Test
    public void testGetVersions() {
        // Test getting the versions of multiple app version patterns with a valid regex
        String input1 = "subscriberha-1.0.0";
        String input2 = "subscriberha-1.0.0-586499";

        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.buildJobName = null;
        expected.buildNumber = null;

        AppVersion actual1 = AppVersion.getVersion(input1);
        assertEquals(expected.version, actual1);

        AppVersion actual2 = AppVersion.getVersion(input2);
        assertEquals(expected.version, actual2);
    }

}