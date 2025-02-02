package com.netflix.frigga.ami;

public class Generated[

parseName_WithoutValidAppPattern_ReturnsNull {

    @Test
    public void [parseName_WithoutValidAppPattern_ReturnsNull() {
        String amiName = "subscriberha-1.0.0-586499 abc";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}