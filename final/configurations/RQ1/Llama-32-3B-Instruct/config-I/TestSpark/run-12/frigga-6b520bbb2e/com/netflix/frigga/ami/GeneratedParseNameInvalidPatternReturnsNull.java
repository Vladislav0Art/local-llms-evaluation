package com.netflix.frigga.ami;

public class GeneratedParseNameInvalidPatternReturnsNull {

    @Test
    public void parseNameInvalidPatternReturnsNull() {
        Assert.assertNull(AppVersion.parseName("invalid-pattern"));
    }

}