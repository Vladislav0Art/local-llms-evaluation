package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);

        String testString = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        Matcher matcher = pattern.matcher(testString);
        assertTrue(matcher.find());
    }

    @Test
    public void testParseName() {
        String testString = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(testString);
        assertNotNull(appVersion);

        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("586499", appVersion.getBuildNumber());
        assertEquals("h150", appVersion.getCommit());
    }

    @Test
    public void testParseNameNullInput() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertNull(appVersion);
    }

}