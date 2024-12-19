package com.netflix.frigga.ami;

public class GeneratedGetCommit_MultipleNames {

    @Test
    public void getCommit_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getCommit());
    }

}