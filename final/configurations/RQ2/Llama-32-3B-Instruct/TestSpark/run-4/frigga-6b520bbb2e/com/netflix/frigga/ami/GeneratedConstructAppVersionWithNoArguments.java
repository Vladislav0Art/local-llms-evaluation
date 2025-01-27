package com.netflix.frigga.ami;

public class GeneratedConstructAppVersionWithNoArguments {

    @Test
    public void constructAppVersionWithNoArguments() {
        String amiId = "123456789012345678901234567890";
        AppVersion appVersion = new AppVersion(amiId, "", "");
        assertNotNull(appVersion);
    }

}