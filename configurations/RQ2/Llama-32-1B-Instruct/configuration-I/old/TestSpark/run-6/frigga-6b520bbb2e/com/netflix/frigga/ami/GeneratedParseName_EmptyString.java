package com.netflix.frigga.ami;

public class GeneratedParseName_EmptyString {

    @Test
    public void parseName_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        try {
            appVersion.parseName(amiName);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}