package com.netflix.frigga.ami;

public class GeneratedTest {

    private int major;
    private int minor;

    public static AppVersion createAppVersion(int major, int minor) {
        return new AppVersion(major, minor);
    }

    public static String getChangelist() {
        return "1.0";
    }
}

public class GeneratedTest {

    @Test
    public void parseNameValidAmarthubTest() {
        String amiName = "amarhub:latest";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameInvalidFormatTest() {
        String amiName = "invalid-format";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void parseNameUnknownPlatformTest() {
        String amiName = "unknown-platform:latest";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void getAppVersionPatternTest() {
        String expected = "amarhub\\d+\\.\\d+";
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher(expected).find());
    }

}