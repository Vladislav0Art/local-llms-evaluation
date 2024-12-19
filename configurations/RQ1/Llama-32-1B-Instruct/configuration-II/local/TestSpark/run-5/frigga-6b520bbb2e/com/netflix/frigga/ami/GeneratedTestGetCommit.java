package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        // Test getting the commit of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.commit = "586499";

        String actual = AppVersion.getCommit(input);
        assertEquals(expected.commit, actual);
    }

}