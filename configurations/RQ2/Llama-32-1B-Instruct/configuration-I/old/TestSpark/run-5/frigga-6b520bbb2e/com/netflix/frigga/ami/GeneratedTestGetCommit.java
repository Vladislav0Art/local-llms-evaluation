package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        String amiName = "ami-1234567890abcdef";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("commit_hash", appVersion.getCommit());
    }

}