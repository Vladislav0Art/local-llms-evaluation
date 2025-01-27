package com.netflix.frigga.ami;

public class GeneratedParseName_InvalidFormat_throwsException {

    @Test
    public void parseName_InvalidFormat_throwsException() {
        try {
            AppVersion.parseName("invalid-format");
            fail("Expected exception was not thrown.");
        } catch (Exception e) {
            // Expected
        }
    }

}