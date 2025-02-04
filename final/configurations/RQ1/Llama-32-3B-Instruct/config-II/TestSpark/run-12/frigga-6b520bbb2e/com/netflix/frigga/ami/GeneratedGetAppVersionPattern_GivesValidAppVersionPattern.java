package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern_GivesValidAppVersionPattern {

    @Test
    public void getAppVersionPattern_GivesValidAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("subscriberha-1.0.0-586499").find());
    }

}