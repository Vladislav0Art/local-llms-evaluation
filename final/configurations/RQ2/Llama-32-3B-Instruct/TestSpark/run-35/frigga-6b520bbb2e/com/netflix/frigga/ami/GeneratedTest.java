package com.netflix.frigga.ami;

public class GeneratedTest {

    private String packageName;
    private String version;

    public AppVersion(String packageName, String version) {
        this.packageName = packageName;
        this.version = version;
    }

    public static AppVersion fromString(String str) {
        if (str == null || !str.contains(":")) {
            return null;
        }
        String[] parts = str.split(":");
        return new AppVersion(parts[0], parts[1]);
    }

    public String getPackageName() {
        return packageName;
    }

    public String getVersion() {
        return version;
    }
}

public class AppVersionTest {

    @Test
    public void parseName_SimpleAppVersion_ReturnsParsedAppVersion() {
        String amiName = "my-package/my-version";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNotNull(parsedAppVersion);
        assertTrue(parsedAppVersion.getPackageName().equals("my-package"));
        assertTrue(parsedAppVersion.getVersion().equals("my-version"));
    }

    @Test
    public void parseName_MissingPackage_ReturnsNull() {
        String amiName = "my-version";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

    @Test
    public void parseName_InvalidFormat_ReturnsNull() {
        String amiName = "invalid-format";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

    @Test
    public void getAppVersionPattern_MatchReturnsTrue() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern.matcher("my-package/my-version").find());
    }

}