package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionPattern {

    @Test
    public void testGetAppVersionPattern() {
        Pattern appVersionPattern = AppVersion.getAppVersionPattern();
        assertNotNull(appVersionPattern);
        assertEquals("([" + NameConstants.NAME_HYPHEN_CHARS + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?", appVersionPattern.pattern());
    }

}