package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionPattern {

    private AppVersion appVersion;

    @Before
    public void setUp() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetAppVersionPattern() {
        Pattern expected = Pattern.compile("([" + NameConstants.NAME_HYPHEN_CHARS + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");
        Pattern actual = AppVersion.getAppVersionPattern();
        assertEquals(expected, actual);
    }

}