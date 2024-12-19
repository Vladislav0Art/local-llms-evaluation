package com.netflix.frigga.ami;

public class GeneratedGetChangelist_DivideBySpace {

    @Test
    public void getChangelist_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("changelist", appVersion.getChangelist());
    }

}