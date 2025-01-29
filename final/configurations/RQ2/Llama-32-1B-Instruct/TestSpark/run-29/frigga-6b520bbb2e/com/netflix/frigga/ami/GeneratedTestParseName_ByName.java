package com.netflix.frigga.ami;

public class GeneratedTestParseName_ByName {

    @Test
    public void testParseName_ByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals("ami-1234567890abcdef", AppVersion.parseName("ami-1234567890abcdef"));
    }

}