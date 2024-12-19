package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern_doesNotMatchOtherRegexes {

    @Test
    public void getAppVersionPattern_doesNotMatchOtherRegexes() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertFalse(pattern.matcher("InvalidAppVersion").find());
    }

}