package com.netflix.frigga.ami;

public class GeneratedTestGetVersion {

    private String version;
    private int buildNumber;

    public static Pattern getAppVersionPattern() {
        return Pattern.compile("([0-9]+\\.[0-9]+\\.[0-9]+)-([0-9]+)");
    }

    public static String getPackageName() {
        return "com.netflix.frigga";
    }

    private AppVersion(String name) {
        this.version = parseName(name);
    }

    public static AppVersion createAppVersion(String amiName) {
        return new AppVersion(amiName);
    }

    public String getVersion() {
        return version;
    }

    public int getBuildNumber() {
        return buildNumber == 0 ? 0 : Integer.parseInt(buildNumber);
    }

    private static Pattern namePattern = Pattern.compile("([a-zA-Z0-9]+-[a-zA-Z0-9]+)");

    private String parseName(String name) {
        Matcher matcher = namePattern.matcher(name);
        if (matcher.matches()) {
            return matcher.group(1);
        } else {
            return "";
        }
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = String.valueOf(buildNumber);
    }

    public int getBuildNumberInt() {
        return Integer.parseInt(this.buildNumber);
    }
}

public class TestAppVersion {

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion("1.2.3-4");
        assertEquals("1.2.3", appVersion.getVersion());
    }

}