package com.netflix.frigga.ami;

public class GeneratedTestIsVersionNotNull {

    private String packageName;
    private String version;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public boolean isPackageNameNotNull() {
        return !packageName == null || packageName.isEmpty();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isVersionNotNull() {
        return !version == null || version.isEmpty();
    }
}

public class GeneratedTest {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
        appVersion.setPackageName("test");
        appVersion.setVersion("test");
    }

    @Test
    public void testIsVersionNotNull() {
        assertTrue(appVersion.isVersionNotNull());
    }

}