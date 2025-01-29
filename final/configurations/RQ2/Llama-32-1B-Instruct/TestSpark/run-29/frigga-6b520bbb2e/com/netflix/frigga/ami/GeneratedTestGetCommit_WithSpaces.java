package com.netflix.frigga.ami;

public class GeneratedTestGetCommit_WithSpaces {

    @Test
    public void testGetCommit_WithSpaces() {
        AppVersion.parseName("ami 1234567890abcdef");
        assertEquals(AppVersion.getCommit(), "1234567890abcdef");
    }
}

}