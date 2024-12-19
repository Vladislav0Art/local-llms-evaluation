package com.netflix.frigga.ami;

public class GeneratedGetCommit_EmptyString {

    @Test
    public void getCommit_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getCommit());
    }

}