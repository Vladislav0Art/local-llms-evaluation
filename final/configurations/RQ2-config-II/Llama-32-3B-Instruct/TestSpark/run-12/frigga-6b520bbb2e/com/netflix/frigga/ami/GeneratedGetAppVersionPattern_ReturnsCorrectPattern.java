package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern_ReturnsCorrectPattern {

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        Pattern expectedPattern = Pattern.compile(".*\\.my\\.version\\.\\d+\\.\\d+$");
        assertEquals(expectedPattern, AppVersion.getAppVersionPattern());
    }

}