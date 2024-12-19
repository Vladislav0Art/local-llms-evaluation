package com.netflix.frigga.ami;

public class GeneratedTest_getBuildJobName {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    private static AppVersion parseName(String amiName) {
        return new AppVersion();
    }

    @Test
    public void test_getBuildJobName() {
        String appVersion = new AppVersion("package1", "1.0");
        assertEquals("package1", appVersion.getBuildJobName());
    }

}