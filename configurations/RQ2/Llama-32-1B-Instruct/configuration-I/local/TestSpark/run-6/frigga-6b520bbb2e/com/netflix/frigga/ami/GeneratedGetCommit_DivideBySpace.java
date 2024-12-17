package com.netflix.frigga.ami;

public class GeneratedGetCommit_DivideBySpace {

    @Test
    public void getCommit_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("commit", appVersion.getCommit());
    }

}