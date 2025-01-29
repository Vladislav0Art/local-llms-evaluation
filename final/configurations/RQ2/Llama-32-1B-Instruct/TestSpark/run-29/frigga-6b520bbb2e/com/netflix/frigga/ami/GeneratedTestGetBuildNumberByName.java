package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumberByName {

    @Test
    public void testGetBuildNumberByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals(AppVersion.getBuildNumber(), "1234567890abcdef");
    }

}