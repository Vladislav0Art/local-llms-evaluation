package com.netflix.frigga.ami;

public class GeneratedGetCommit_ValidAppVersion_ReturnsCommit {

    @Test
    public void getCommit_ValidAppVersion_ReturnsCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.commit = "commit-id";
        assertEquals("commit-id", appVersion.getCommit());
    }

}