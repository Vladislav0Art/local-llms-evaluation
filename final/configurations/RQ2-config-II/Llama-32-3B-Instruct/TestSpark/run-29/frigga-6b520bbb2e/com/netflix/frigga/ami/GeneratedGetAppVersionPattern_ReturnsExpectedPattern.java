package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern_ReturnsExpectedPattern {

    @Test
    public void getAppVersionPattern_ReturnsExpectedPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern != null);
        assertEquals(Pattern.compile("^[a-zA-Z]+\\.[a-zA-Z]+-\\d+$"), pattern);
    }

}