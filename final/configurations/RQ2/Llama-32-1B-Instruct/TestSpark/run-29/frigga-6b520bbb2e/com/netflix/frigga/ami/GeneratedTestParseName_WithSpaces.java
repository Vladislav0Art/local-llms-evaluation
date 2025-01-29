package com.netflix.frigga.ami;

public class GeneratedTestParseName_WithSpaces {

    @Test
    public void testParseName_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals("ami 1234567890abcdef", AppVersion.parseName("ami 1234567890abcdef"));
    }

}