package com.netflix.frigga.ami;

public class GeneratedTestGetPackageAndVersion {

    @Override
    public int compareTo(AppVersion other) {
        return Integer.compare(this.getVersion(), other.getVersion());
    }

    public String getPackageName() {
        // Mock implementation, returns a hardcoded string
        return "example-package";
    }

    public Pattern getAppVersionPattern() {
        // Mock implementation, returns a hardcoded pattern
        return Pattern.compile("^[0-9]+$");
    }

    @Override
    public String toString() {
        // Mock implementation, always returns a hardcoded string
        return "AppVersionImpl";
    }
}

public class AppVersionTest {

    @Test
    public void testGetPackageAndVersion() {
        AppVersionImpl appVersion = new AppVersionImpl();
        String amiName = "1.0.0-1234567";
        String packageVersion = appVersion.getPackageName() + "-" + appVersion.getVersion();
        assertEquals("example-package-1.0.0", packageVersion);
    }

}