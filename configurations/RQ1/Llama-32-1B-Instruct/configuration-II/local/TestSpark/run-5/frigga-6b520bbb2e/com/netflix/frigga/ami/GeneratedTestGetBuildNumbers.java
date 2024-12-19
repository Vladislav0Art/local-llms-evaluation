package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumbers {

    @Test
    public void testGetBuildNumbers() {
        // Test getting the build numbers of multiple app version patterns with a valid regex
        String input1 = "subscriberha-1.0.0";
        String input2 = "subscriberha-1.0.0-586499";

        AppVersion expected = new AppVersion();
        expected.buildJobName = null;
        expected.buildNumber = null;

        AppVersion actual1 = AppVersion.getBuildNumber(input1);
        assertEquals(expected.buildNumber, actual1);

        AppVersion actual2 = AppVersion.getBuildNumber(input2);
        assertEquals(expected.buildNumber, actual2);
    }

}