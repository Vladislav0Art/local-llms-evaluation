package com.netflix.frigga.ami;

public class GeneratedGetVersion_DivideBySpace {

    @Test
    public void getVersion_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("1.0", appVersion.getVersion());
    }

}