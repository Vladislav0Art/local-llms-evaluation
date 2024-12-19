package com.netflix.frigga.ami;

public class GeneratedParseNameValidStringReturnsParsedAppVersion {

    private String version;

    public static AppVersion parseName(String name) {
        return new AppVersion(name);
    }

    public AppVersion() {
    }

    public AppVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        AppVersion other = (AppVersion) obj;
        return Objects.equals(version, other.version);
    }

    @Override
    public int compareTo(AppVersion other) {
        // Implementation
        return 0; // Replace with actual implementation
    }

    public static Pattern getAppVersionPattern() {
        return null; // Replace with actual implementation
    }
}

public class AppVersionTest {

    @Test
    public void parseNameValidStringReturnsParsedAppVersion() {
        String amiName = "1.0-1";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertTrue(parsedAppVersion.equals(new AppVersion(amiName)));
    }

}