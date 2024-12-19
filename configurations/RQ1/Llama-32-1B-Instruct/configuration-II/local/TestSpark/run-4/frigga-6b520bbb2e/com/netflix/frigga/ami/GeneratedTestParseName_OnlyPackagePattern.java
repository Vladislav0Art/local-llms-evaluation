package com.netflix.frigga.ami;

public class GeneratedTestParseName_OnlyPackagePattern {

    @link
    AppVersion#parseName
}.
        */

public class AppVersionTestParseName {

    @Test
    public void testParseName_OnlyPackagePattern() {
        AppVersion version = new AppVersion();
        Pattern pattern = Pattern.compile(
                "([" + NameConstants.NAME_HYPHEN_CHARS
                        + "]+)-([0-9.a-zA-Z~]+)(?:[.](\\w+))??(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");
        Matcher matcher = pattern.matcher(version.amiName);
        assertNotEquals(null, matcher.matches());
    }

}