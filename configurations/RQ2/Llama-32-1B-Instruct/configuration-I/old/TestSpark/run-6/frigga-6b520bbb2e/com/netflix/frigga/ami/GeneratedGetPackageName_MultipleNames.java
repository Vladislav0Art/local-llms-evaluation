package com.netflix.frigga.ami;

public class GeneratedGetPackageName_MultipleNames {

    @Test
    public void getPackageName_MultipleNames() {
        String amiName = "appversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("RPM", appVersion.getPackageName());
    }

}