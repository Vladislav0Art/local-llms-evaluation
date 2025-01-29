package com.netflix.frigga.ami;

public class GeneratedTestParseName_InvalidInput {

    @Test
    public void testParseName_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> AppVersion.parseName(null));
    }

}