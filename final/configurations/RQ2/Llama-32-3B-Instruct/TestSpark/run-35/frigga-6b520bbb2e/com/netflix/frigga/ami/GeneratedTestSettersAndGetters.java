package com.netflix.frigga.ami;

public class GeneratedTestSettersAndGetters {

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
    public void testSettersAndGetters() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("my-package");
        appVersion.setVersion("my-version");
        assertEquals("my-package", appVersion.getPackageName());
        assertEquals("my-version", appVersion.getVersion());
    }

}