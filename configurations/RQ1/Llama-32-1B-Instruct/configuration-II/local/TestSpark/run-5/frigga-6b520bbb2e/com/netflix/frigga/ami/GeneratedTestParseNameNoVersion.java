package com.netflix.frigga.ami;

public class GeneratedTestParseNameNoVersion {

    @Test
    public void testParseNameNoVersion() {
        // Test parsing an app version pattern with no version
        String input = "subscriberha-586499";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.buildJobName = null;
        expected.buildNumber = null;

        AppVersion actual = AppVersion.parseName(input);
        assertNotEquals(expected, actual);
    }

}