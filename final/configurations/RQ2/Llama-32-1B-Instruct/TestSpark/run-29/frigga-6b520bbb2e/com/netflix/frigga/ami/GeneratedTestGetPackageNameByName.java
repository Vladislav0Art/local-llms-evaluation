package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNameByName {

    @Test
    public void testGetPackageNameByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals(AppVersion.getPackageName(), "ami-1234567890abcdef");
    }

}