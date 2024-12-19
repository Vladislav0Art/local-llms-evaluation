package com.netflix.frigga.ami;

public class GeneratedGetChangelist_EmptyString {

    @Test
    public void getChangelist_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getChangelist());
    }

}