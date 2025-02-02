package com.netflix.frigga.ami;

public class GeneratedGivenNullAmiName_whenParseName_thenReturnsNull {

    @Test
    public void givenNullAmiName_whenParseName_thenReturnsNull() {
        Assert.assertNull(AppVersion.parseName(null));
    }

}