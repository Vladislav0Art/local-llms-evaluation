package com.netflix.frigga.ami;

public class GeneratedTestToString_WithSpaces {

    @Test
    public void testToString_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals(AppVersion.toString(), "ami 1234567890abcdef");
    }

}