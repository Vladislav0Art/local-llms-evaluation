package com.netflix.frigga.ami;

public class GeneratedTestToStringByName {

    @Test
    public void testToStringByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals(AppVersion.toString(), "ami-1234567890abcdef");
    }

}