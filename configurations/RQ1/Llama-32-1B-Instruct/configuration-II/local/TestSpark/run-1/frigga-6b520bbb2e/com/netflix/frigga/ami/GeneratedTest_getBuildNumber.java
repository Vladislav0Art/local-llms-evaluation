package com.netflix.frigga.ami;

public class GeneratedTest_getBuildNumber {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    private static AppVersion parseName(String amiName) {
        return new AppVersion();
    }

    @Test
    public void test_getBuildNumber() {
        String appVersion = new AppVersion("package1", "1.0");
        assertEquals("1.0", appVersion.getBuildNumber());
    }

}