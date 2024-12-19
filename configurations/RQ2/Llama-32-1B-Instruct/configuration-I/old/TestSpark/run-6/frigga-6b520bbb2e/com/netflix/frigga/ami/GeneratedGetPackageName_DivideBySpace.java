package com.netflix.frigga.ami;

public class GeneratedGetPackageName_DivideBySpace {

    @Test
    public void getPackageName_DivideBySpace() {
        String amiName = "appversion 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("RPM", appVersion.getPackageName());
    }

}