package com.netflix.frigga.ami;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        // Test the equals method of an app version pattern with a valid regex
        String input1 = "subscriberha-1.0.0";
        String input2 = "subscriberha-1.0.0";

        AppVersion expected1 = new AppVersion();
        expected1.packageName = "subscriberha";
        expected1.buildJobName = null;
        expected1.buildNumber = null;

        AppVersion actual1 = AppVersion.getPackageName(input1);
        assertEquals(expected1, actual1);

        AppVersion actual2 = AppVersion.getPackageName(input2);
        assertEquals(expected1, actual2);
    }

}