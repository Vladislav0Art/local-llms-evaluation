package com.netflix.frigga.ami;

public class GeneratedTestParseName_OnlyVersionPattern {

    @link
    AppVersion#parseName
}.
        */

public class AppVersionTestParseName {

    @Test
    public void testParseName_OnlyVersionPattern() {
        AppVersion version = new AppVersion();
        Pattern pattern = Pattern.compile(
                "([" + NameConstants.NAME_HYPHEN_CHARS
                        + "]+)-([0-9.a-zA-Z~]+)(?:[.](\\w+))??(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");
        Matcher matcher = pattern.matcher("subscriberha-1.0.0");
        assertNotEquals(null, matcher.matches());
    }

}