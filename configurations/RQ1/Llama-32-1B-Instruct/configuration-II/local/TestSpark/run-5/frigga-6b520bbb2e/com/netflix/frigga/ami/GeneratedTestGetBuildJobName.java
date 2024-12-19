package com.netflix.frigga.ami;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        // Test getting the build job name of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0-586499";
        AppVersion expected = new AppVersion();
        expected.buildJobName = null;

        String actual = AppVersion.getBuildJobName(input);
        assertEquals(expected.buildJobName, actual);
    }

}