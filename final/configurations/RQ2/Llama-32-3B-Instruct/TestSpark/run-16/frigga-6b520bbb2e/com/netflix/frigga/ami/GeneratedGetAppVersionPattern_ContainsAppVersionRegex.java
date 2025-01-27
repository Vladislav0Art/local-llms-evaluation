package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern_ContainsAppVersionRegex {

    @Test
    public void getAppVersionPattern_ContainsAppVersionRegex() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern != null);
        assertTrue(pattern.matcher("ami-1234567890").find());
    }

}