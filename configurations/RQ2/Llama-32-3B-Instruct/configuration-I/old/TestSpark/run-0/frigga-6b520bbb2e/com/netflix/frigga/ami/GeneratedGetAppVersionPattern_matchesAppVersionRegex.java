package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern_matchesAppVersionRegex {

    @Test
    public void getAppVersionPattern_matchesAppVersionRegex() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("1.2.3").find());
    }

}