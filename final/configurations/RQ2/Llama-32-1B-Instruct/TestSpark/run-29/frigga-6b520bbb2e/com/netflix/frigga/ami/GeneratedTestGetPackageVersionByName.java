package com.netflix.frigga.ami;

public class GeneratedTestGetPackageVersionByName {

    @Test
    public void testGetPackageVersionByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals(AppVersion.getPackageVersion(), "ami-1234567890abcdef");
    }

}