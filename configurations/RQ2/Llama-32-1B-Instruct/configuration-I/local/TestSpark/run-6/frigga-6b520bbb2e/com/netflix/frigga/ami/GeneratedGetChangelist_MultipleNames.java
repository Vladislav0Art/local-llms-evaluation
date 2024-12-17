package com.netflix.frigga.ami;

public class GeneratedGetChangelist_MultipleNames {

    @Test
    public void getChangelist_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getChangelist());
    }

}