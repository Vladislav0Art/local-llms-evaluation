package com.netflix.frigga.ami;

public class GeneratedGetVersion_EmptyString {

    @Test
    public void getVersion_EmptyString() {
        String amiName = "";
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getVersion());
    }

}