package com.netflix.frigga.ami;

public class GeneratedGetCommit_ReturnsCommit {

    @Test
    public void getCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("abcdefg");
        String commit = appVersion.getCommit();
        assertEquals("abcdefg", commit);
    }

}