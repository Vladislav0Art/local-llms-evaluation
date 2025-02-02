package com.netflix.frigga.ami;

public class GeneratedParseName_EmptyString_ReturnsNull {

    @Test
    public void parseName_EmptyString_ReturnsNull() {
        AppVersion result = AppVersion.parseName("");
        assertNull(result);
    }

}