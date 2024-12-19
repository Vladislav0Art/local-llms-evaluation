package com.netflix.frigga.ami;

public class GeneratedGetCommit_NoSpaces {

    @Test
    public void getCommit_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("commit", appVersion.getCommit());
    }

}