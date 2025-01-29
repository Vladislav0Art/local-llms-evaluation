package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist_WithSpaces {

    @Test
    public void testGetChangelist_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals(AppVersion.getChangelist(), "1234567890abcdef");
    }
}

}