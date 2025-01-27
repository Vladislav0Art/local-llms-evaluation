package com.netflix.frigga.ami;

public class GeneratedParseName_AmiNameWithoutPackage {

    @Test
    public void parseName_AmiNameWithoutPackage() {
        String amiId = "123456789012345678901234567890";
        AppVersion appVersion = AppVersion.parse(amiId);
        assertNull(appVersion.getPackageName());
    }

}