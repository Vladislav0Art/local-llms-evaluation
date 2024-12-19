package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        // Test getting the version of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0-586499";
        AppVersion expected = new AppVersion();
        expected.version = "1.0.0";

        String actual = AppVersion.getVersion(input);
        assertEquals(expected.version, actual);
    }

}