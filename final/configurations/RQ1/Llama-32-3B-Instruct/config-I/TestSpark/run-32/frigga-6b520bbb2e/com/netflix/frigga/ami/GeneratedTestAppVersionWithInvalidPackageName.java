package com.netflix.frigga.ami;

public class GeneratedTestAppVersionWithInvalidPackageName {

    @Test
    public void testAppVersionWithInvalidPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("invalid-package");

        assertEquals("invalid-package", appVersion.getPackageName());

        assertNull(appVersion.parseName(""));
        assertNotNull(appVersion.parseName("subscriberha/1.0.0-586499"));
    }
}

public class AppVersion {
    private String packageName;
    private String version;

    public static AppVersion parseName(String name) {
        // implementation
        return new AppVersion();
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

}