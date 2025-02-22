package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.commit = "commit";
        assertEquals("commit", appVersion.getCommit());
    }

}