package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        // Test getting the package name of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";

        String actual = AppVersion.getPackageName(input);
        assertEquals(expected.packageName, actual);
    }

}