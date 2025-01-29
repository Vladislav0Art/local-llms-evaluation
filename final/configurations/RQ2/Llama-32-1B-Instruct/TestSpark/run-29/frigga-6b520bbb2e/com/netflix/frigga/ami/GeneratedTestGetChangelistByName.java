package com.netflix.frigga.ami;

public class GeneratedTestGetChangelistByName {

    @Test
    public void testGetChangelistByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals(AppVersion.getChangelist(), "1234567890abcdef");
    }

}