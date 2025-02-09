package com.netflix.frigga.ami;

public class GeneratedTestSettersAndGettersWithNullValues {

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
    public void testSettersAndGettersWithNullValues() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName(null);
        appVersion.setVersion(null);
        assertNull(appVersion.getPackageName());
        assertNull(appVersion.getVersion());
    }

}