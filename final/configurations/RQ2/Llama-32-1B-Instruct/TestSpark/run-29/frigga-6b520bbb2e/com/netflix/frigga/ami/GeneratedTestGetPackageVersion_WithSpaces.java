package com.netflix.frigga.ami;

public class GeneratedTestGetPackageVersion_WithSpaces {

    @Test
    public void testGetPackageVersion_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals(AppVersion.getPackageVersion(), "ami 1234567890abcdef");
    }
}

}