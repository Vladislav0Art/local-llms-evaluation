package com.netflix.frigga.ami;

public class GeneratedGetAppVersionPattern_ReturnsAppVersionPattern {

    @Test
    public void getAppVersionPattern_ReturnsAppVersionPattern() {
        Pattern expectedPattern = Pattern.compile("([" + NameConstants.NAME_HYPHEN_CHARS + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");
        assertEquals(expectedPattern, AppVersion.getAppVersionPattern());
    }

}