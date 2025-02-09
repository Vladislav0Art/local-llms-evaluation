package com.netflix.frigga.ami;

public class GeneratedTestConstructor {

    private String packageName;
    private String version;

    public AppVersion() {
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setVersion(String version) {
        this.version = version;
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
    public void testConstructor() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getPackageName());
        assertNull(appVersion.getVersion());
    }

}