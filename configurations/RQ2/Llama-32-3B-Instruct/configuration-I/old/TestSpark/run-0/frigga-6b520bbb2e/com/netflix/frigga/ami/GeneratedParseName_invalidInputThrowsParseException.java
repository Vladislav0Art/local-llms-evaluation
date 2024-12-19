package com.netflix.frigga.ami;

public class GeneratedParseName_invalidInputThrowsParseException {

    @Test
    public void parseName_invalidInputThrowsParseException() {
        try {
            AppVersion.parseName("InvalidAppVersion");
            fail();
        } catch (ParseException e) {
            // Expected exception
        }
    }

}