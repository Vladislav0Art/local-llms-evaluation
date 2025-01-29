package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName_WithSpaces {

    @Test
    public void testGetPackageName_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals(AppVersion.getPackageName(), "ami 1234567890abcdef");
    }
}

}