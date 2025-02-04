package com.netflix.frigga.ami;

public class GeneratedParseName_NullInput_ReturnsNull {

    @Test
    public void parseName_NullInput_ReturnsNull() {
        String amiName = null;
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}