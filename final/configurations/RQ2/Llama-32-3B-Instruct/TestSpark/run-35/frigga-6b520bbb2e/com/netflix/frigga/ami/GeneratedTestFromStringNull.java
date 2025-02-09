package com.netflix.frigga.ami;

public class GeneratedTestFromStringNull {

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

    public String toString() {
        return packageName + ":" + version;
    }
}

public class AppVersionTest {

    @Test
    public void testFromStringNull() {
        AppVersion appVersion = AppVersion.fromString(null);
        assertNull(appVersion);
    }

}