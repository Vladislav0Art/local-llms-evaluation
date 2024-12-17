package com.netflix.frigga.ami;

public class GeneratedTestGetHashCodeAndEquals {

    private static final Pattern getAppVersionPattern = new Pattern();
    private static final String getPackageName = "example-ami";
    private static final String getVersion = "1.0";
    private static final String getBuildJobName = "my-jenkins-job";
    private static final String getBuildNumber = "1234567890";
    private static final String getCommit = "abcde1234";

    @Test
    public void testGetHashCodeAndEquals() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName(getPackageName);
        appVersion1.setVersion(getVersion);
        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName(getPackageName);
        appVersion2.setVersion(getVersion);

        assertEquals(appVersion1, appVersion2); // should be equal
    }
}

class Pattern {
    public static Matcher<String> matches(String input) {
        return Pattern.matches("^.*\\d+$", input);
    }

    public static Pattern regex() {
        return Pattern.compile("^[a-zA-Z0-9]+$");
    }

}