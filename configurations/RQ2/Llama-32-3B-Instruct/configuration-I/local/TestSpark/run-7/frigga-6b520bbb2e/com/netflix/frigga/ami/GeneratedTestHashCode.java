package com.netflix.frigga.ami;

public class GeneratedTestHashCode {

    private String version;
    private String release;

    // Constructor with two parameters
    public AppVersion(String version, String release) {
        this.version = version;
        this.release = release;
    }

    // Public method to get the version
    public String getVersion() {
        return version;
    }

    // Public method to get the release
    public String getRelease() {
        return release;
    }

    // Public method to check equality with another AppVersion object
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        AppVersion appVersion = (AppVersion) obj;

        // Compare version and release fields using equals method for String
        return Objects.equals(version, appVersion.version) && Objects.equals(release, appVersion.release);
    }

    // Public method to check hash code
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (release != null ? release.hashCode() : 0);
        return result;
    }

    // Public method to generate a string representation
    @Override
    public String toString() {
        return "AppVersion{" +
                "version='" + version + '\'' +
                ", release='" + release + '\'' +
                '}';
    }
}

public class AppVersionTest {

    private static final AppVersion amiName1 = new AppVersion("1.0.0", "release1");
    private static final AppVersion amiName2 = new AppVersion("1.0.0", "release1");

    // Test for equals method

    @Test
    public void testHashCode() {
        int expectedHashcode = amiName1.hashCode();
        assertEquals(expectedHashcode, amiName1.hashCode());
    }

}