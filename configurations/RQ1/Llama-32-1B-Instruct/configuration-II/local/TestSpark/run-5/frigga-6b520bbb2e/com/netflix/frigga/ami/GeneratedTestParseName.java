package com.netflix.frigga.ami;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        // Test parsing a valid app version pattern
        String input = "subscriberha-1.0.0-586499";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.version = "1.0.0";
        expected.buildJobName = null;
        expected.buildNumber = null;
        expected.commit = "586499";

        AppVersion actual = AppVersion.parseName(input);
        assertNotEquals(null, actual);
        assertEquals(expected.packageName, actual.packageName);
        assertEquals(expected.version, actual.version);
    }

}