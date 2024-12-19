package com.netflix.frigga.ami;

public class GeneratedTest_parse_name_invalid_build_number {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    private static AppVersion parseName(String amiName) {
        return new AppVersion();
    }

    @Test
    public void test_parse_name_invalid_build_number() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = parseName(amiName);
        assertNull(appVersion);
    }

}