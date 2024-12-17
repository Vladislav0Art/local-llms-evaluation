package com.netflix.frigga.ami;

public class GeneratedGetVersion_MultipleNames {

    @Test
    public void getVersion_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getVersion());
    }

}