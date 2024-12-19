package com.netflix.frigga.ami;

public class GeneratedTestParseName_OnlyBuildNumberPattern {

    @link
    AppVersion#parseName
}.
        */

public class AppVersionTestParseName {

    @Test
    public void testParseName_OnlyBuildNumberPattern() {
        AppVersion version = new AppVersion();
        Pattern pattern = Pattern.compile(
                "([" + NameConstants.NAME_HYPHEN_CHARS
                        + "]+)-([0-9.a-zA-Z~]+)(?:[.](\\w+))??(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");
        Matcher matcher = pattern.matcher("buildNumber");
        assertNotEquals(null, matcher.matches());
    }

}