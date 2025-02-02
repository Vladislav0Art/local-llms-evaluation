package com.netflix.frigga.ami;

public class GeneratedParseNameEmptyStringReturnsNull {

    @Test
    public void parseNameEmptyStringReturnsNull() {
        Assert.assertNull(AppVersion.parseName(""));
    }

}