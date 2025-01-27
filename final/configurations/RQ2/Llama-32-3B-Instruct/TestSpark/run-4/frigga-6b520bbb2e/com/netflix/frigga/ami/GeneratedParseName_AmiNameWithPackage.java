package com.netflix.frigga.ami;

public class GeneratedParseName_AmiNameWithPackage {

    @Test
    public void parseName_AmiNameWithPackage() {
        String packageName = "com.netflix.frigga.ami";
        String amiId = "123456789012345678901234567890";
        AppVersion appVersion = AppVersion.parse(amiId, packageName);
        assertEquals(packageName, appVersion.getPackageName());
    }

}