package com.netflix.frigga.ami;

public class GeneratedTest {

    private static final Pattern getAppVersionPattern = new Pattern();
    private static final String getPackageName = "example-ami";
    private static final String getVersion = "1.0";
    private static final String getBuildJobName = "my-jenkins-job";
    private static final String getBuildNumber = "1234567890";
    private static final String getCommit = "abcde1234";

    @Test
    public void testParseName() {
        AppVersion appVersion = new AppVersion();
        appVersion.parseName(getPackageName);
        assertEquals("example-ami", appVersion.getVersion());
        assertNull(appVersion.getChangelist()); // deprecated method, but we're testing it here
    }

    @Test
    public void testGetPackageAndVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName(getPackageName);
        appVersion.setVersion(getVersion);
        assertEquals(getPackageName, appVersion.getVersion());
    }

    @Test
    public void testGetBuildJobNameAndGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName(getBuildJobName);
        appVersion.setBuildNumber(getBuildNumber);
        assertEquals(getBuildJobName, appVersion.getBuildJobName());
        assertEquals(getBuildNumber, appVersion.getVersion()); // should match the build number
    }

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit(getCommit);
        assertEquals(getCommit, appVersion.getCommit());
    }

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName(getPackageName);
        appVersion.setVersion(getVersion);
        assertEquals("example-ami", appVersion.toString());
    }

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