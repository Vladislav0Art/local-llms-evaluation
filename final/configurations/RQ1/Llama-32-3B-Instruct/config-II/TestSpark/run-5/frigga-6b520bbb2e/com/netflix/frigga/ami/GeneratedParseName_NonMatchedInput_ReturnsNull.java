package com.netflix.frigga.ami;

public class GeneratedParseName_NonMatchedInput_ReturnsNull {

    @Test
    public void parseName_NonMatchedInput_ReturnsNull() {
        String amiName = "non-matched-input";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}