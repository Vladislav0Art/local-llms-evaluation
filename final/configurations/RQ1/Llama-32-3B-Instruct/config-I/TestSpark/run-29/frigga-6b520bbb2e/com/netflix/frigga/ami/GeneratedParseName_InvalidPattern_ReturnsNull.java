package com.netflix.frigga.ami;

public class GeneratedParseName_InvalidPattern_ReturnsNull {

    @Test
    public void parseName_InvalidPattern_ReturnsNull() {
        String amiName = "Invalid pattern";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

}