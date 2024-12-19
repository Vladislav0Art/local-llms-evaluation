package com.netflix.frigga.ami;

public class GeneratedGetPackageName_EmptyString {

    @Test
    public void getPackageName_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getPackageName());
    }

}