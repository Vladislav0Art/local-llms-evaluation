package com.netflix.frigga.ami;

public class GeneratedGetPackageName_MultipleSpacesAndNewline {

    @Test
    public void getPackageName_MultipleSpacesAndNewline() {
        String amiName = "\n\nappversion tag 1.0";
        AppVersion appVersion = new AppVersion();
        assertEquals("RPM", appVersion.getPackageName());
    }

}