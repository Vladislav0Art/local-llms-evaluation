package com.netflix.frigga.ami;

public class GeneratedParseName_EmptyString_throwsException {

    @Test
    public void parseName_EmptyString_throwsException() {
        try {
            AppVersion.parseName("");
            fail("Expected exception was not thrown.");
        } catch (Exception e) {
            // Expected
        }
    }

}