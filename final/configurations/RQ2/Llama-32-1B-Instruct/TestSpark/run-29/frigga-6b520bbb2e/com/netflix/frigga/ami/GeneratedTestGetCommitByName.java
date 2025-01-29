package com.netflix.frigga.ami;

public class GeneratedTestGetCommitByName {

    @Test
    public void testGetCommitByName() {
        AppVersion.parseName("ami-1234567890abcdef");
        assertEquals(AppVersion.getCommit(), "1234567890abcdef");
    }

}