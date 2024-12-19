package com.netflix.frigga.ami;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        // Test the toString method of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.version = "1.0.0";

        String actual = AppVersion.toString(input);
        assertEquals(expected.toString(), actual);
    }

}