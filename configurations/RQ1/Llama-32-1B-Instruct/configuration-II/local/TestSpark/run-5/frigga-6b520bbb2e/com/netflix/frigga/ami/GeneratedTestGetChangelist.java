package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

    @Test
    public void testGetChangelist() {
        // Test getting the changelist of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.commit = null;

        String actual = AppVersion.getChangelist(input);
        assertEquals(expected.commit, actual);
    }

}