package com.netflix.frigga.ami;

public class GeneratedTestGetPackageNAme_ReturnsPackageNameTest {

    private String version;
    private String buildNumber;

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
        return buildNumber == null ? 0 : Integer.parseInt(buildNumber);
    }

    private static Pattern namePattern = Pattern.compile("([a-zA-Z0-9]+-[a-zA-Z0-9]+)");

    private static String parseName(String name) {
        Matcher matcher = namePattern.matcher(name);
        if (matcher.find()) {
            return matcher.group(1).replace("-", ""); // Removed '-'
        }
        return null;
    }

    public int compareTo(AppVersion other) {
        if (this.getBuildNumber() == 0 && other.getBuildNumber() != 0) {
            return -1;
        } else if (this.getBuildNumber() > 0 && other.getBuildNumber() == 0) {
            return 1;
        }
        int versionCompare = this.getVersion().compareTo(other.getVersion());
        return versionCompare == 0 ? this.getBuildNumber() - other.getBuildNumber() : versionCompare;
    }

    public String toString() {
        return getPackageName() + "/" + getVersion();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        AppVersion other = (AppVersion) obj;

        if (buildNumber == null ? other.buildNumber != null : !buildNumber.equals(other.buildNumber))
            return false;
        return version.equals(other.version);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + buildNumber.hashCode();
        result = 37 * result + version.hashCode();
        return result;
    }
}

public class NameTest {

    @Test
    public void testGetPackageNAme_ReturnsPackageNameTest() {
        AppVersion appVersion = new AppVersion("0.9.2-0");
        assertEquals("com.netflix.frigga", appVersion.getPackageName());
    }

}