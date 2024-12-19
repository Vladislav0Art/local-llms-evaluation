package com.netflix.frigga.ami;

public class GeneratedTestParseNameInvalidPattern {

    @Test
    public void testParseNameInvalidPattern() {
        // Test parsing an app version pattern that is not a valid regex
        String input = "invalid-pattern";
        AppVersion expected = new AppVersion();
        expected.packageName = null;
        expected.version = null;

        AppVersion actual = AppVersion.parseName(input);
        assertNotEquals(expected, actual);
    }

}