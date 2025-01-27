package com.netflix.frigga.ami;

public class GeneratedTest {

    private String version;
    private int buildNumber;

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("([0-9]+\\.[0-9]+\\.[0-9]+)-([0-9]+)");
    }

    public static String getPackageName() {
        return "com.netflix.frigga";
    }

    private AppVersion(String name) {
    }

    public static AppVersion createAppVersion(String amiName) {
        return new AppVersion(amiName);
    }

    public String getVersion() {
        return version;
    }

    public int getBuildNumber() {
        return buildNumber == 0 ? 0 : Integer.parseInt(this.buildNumber);
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = String.valueOf(buildNumber);
    }

    public static AppVersion fromString(String name) {
        Matcher matcher = Pattern.compile("([a-zA-Z0-9]+-[a-zA-Z0-9]+)").matcher(name);
        if (matcher.find()) {
            return new AppVersion(name);
        } else {
            return null;
        }
    }
}

public class TestAppVersion {

    @Test
    public void parseName_SimpleAmarinTest() {
        String amiName = "0.9.2-0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("0.9.2", appVersion.getVersion());
        assertEquals("0", appVersion.getBuildNumber());
    }

    @Test
    public void parseName_AmarinWithChangelistTest() {
        String amiName = "0.9.2-0-12345";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("0.9.2", appVersion.getVersion());
        assertEquals("0", appVersion.getBuildNumber());
    }

    @Test
    public void parseName_InvalidAmarinTest() {
        String amiName = "Invalid";
        assertTrue(AppVersion.parseName(amiName) == null);
    }

    @Test
    public void getAppVersionPattern_ReturnsCorrectPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("0.9.2-0").find());
    }

    @Test
    public void getVersion_ReturnsVersionNumberTest() {
        String version = "0.9.2";
        assertEquals(version, AppVersion.parseName("0.9.2-0").getVersion());
    }

    @Test
    public void getBuildJobName_ReturnsBuildJobNameTest() {
        String buildJobName = "build";
        assertEquals(buildJobName, AppVersion.parseName("0.9.2-0").getBuildJobName());
    }

    @Test
    public void getCommit_ReturnsCommitHashTest() {
        String commit = "12345";
        assertTrue(AppVersion.parseName("0.9.2-0-12345").getCommit().equals(commit));
    }

    @Test
    public void getBuildNumber_ReturnsBuildNumberTest() {
        String buildNumber = "0";
        assertEquals(buildNumber, AppVersion.parseName("0.9.2-0").getBuildNumber());
    }

}