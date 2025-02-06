package com.netflix.frigga.ami;

public class GeneratedGetCommit_ValidAppVersion_ReturnsCommit {

    @Test
    public void getCommit_ValidAppVersion_ReturnsCommit() {
        AppVersion appVersion = new AppVersion("1.2.3-1234567890");
        assertEquals("0", appVersion.getCommit());
    }

}