package com.netflix.frigga.ami;

public class GeneratedTest_parse_name_build_first_commit {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    private static AppVersion parseName(String amiName) {
        return new AppVersion();
    }

    @Test
    public void test_parse_name_build_first_commit() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha";
        AppVersion appVersion = parseName(amiName);
        assertNotNull(appVersion);
        assertEquals(1, appVersion.buildNumber.length());
        assertEquals(null, appVersion.commit);
    }

}