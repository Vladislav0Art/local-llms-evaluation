package com.netflix.frigga.ami;

public class GeneratedGivenEmptyStringWhenParseNameThenReturnsNull {

    @Test
    public void givenEmptyStringWhenParseNameThenReturnsNull() {
        Assert.assertNull(AppVersion.parseName(""));
    }

}