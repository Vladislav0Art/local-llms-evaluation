package com.netflix.frigga.ami;

public class GeneratedTestParseNameNoPattern {

    @Test
    public void testParseNameNoPattern() {
        // Test parsing an app version pattern with no regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.version = "1.0.0";

        AppVersion actual = AppVersion.parseName(input);
        assertNotEquals(expected, actual);
    }

}