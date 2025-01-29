package com.netflix.frigga.ami;

public class GeneratedTestGetBuildNumber_WithSpaces {

    @Test
    public void testGetBuildNumber_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals(AppVersion.getBuildNumber(), "1234567890abcdef");
    }
}

}