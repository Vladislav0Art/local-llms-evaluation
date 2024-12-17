package com.netflix.frigga.ami;

public class GeneratedGetChangelist_NoSpaces {

    @Test
    public void getChangelist_NoSpaces() {
        String amiName = "appversion tag";
        AppVersion appVersion = new AppVersion();
        assertEquals("changelist", appVersion.getChangelist());
    }

}