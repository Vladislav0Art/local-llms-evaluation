package com.netflix.frigga.ami;

public class GeneratedParseNameNullReturnsNull {

    @Test
    public void parseNameNullReturnsNull() {
        Assert.assertNull(AppVersion.parseName(null));
    }

}