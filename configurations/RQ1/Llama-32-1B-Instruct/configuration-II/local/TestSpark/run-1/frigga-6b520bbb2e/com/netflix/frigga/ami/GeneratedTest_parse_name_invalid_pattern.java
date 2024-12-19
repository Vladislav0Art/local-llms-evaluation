package com.netflix.frigga.ami;

public class GeneratedTest_parse_name_invalid_pattern {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    private static AppVersion parseName(String amiName) {
        return new AppVersion();
    }

    @Test
    public void test_parse_name_invalid_pattern() {
        String amiName = "invalid pattern";
        AppVersion appVersion = parseName(amiName);
        assertNull(appVersion);
    }

}