package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void getAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

}