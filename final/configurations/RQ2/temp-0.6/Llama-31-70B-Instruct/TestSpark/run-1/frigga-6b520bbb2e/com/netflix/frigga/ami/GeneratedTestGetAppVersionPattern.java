package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionPattern {

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);

        String testString = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        Matcher matcher = pattern.matcher(testString);
        assertTrue(matcher.find());
    }

}