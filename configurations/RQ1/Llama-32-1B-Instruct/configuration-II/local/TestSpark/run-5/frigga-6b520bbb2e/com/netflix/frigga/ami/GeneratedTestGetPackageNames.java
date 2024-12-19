package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNames {

    @Test
    public void testGetPackageNames() {
        // Test getting the package names of multiple app version patterns with a valid regex
        String input1 = "subscriberha-1.0.0";
        String input2 = "subscriberha-1.0.0-586499";

        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.buildJobName = null;
        expected.buildNumber = null;

        AppVersion actual1 = AppVersion.getPackageName(input1);
        assertEquals(expected.packageName, actual1);

        AppVersion actual2 = AppVersion.getPackageName(input2);
        assertEquals(expected.packageName, actual2);
    }

}