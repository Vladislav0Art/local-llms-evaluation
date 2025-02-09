package com.netflix.frigga.ami;

public class GeneratedConstructorAppVersion_ReturnsCorrectInstance_DifferentAppNames {

    private String appName;
    private String version;

    public static AppVersion parseName(String amiName) {
        // implementation
        return new AppVersion(amiName);
    }

    public AppVersion(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    public String getPackageName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }
}

public class GeneratedTest {

    @Test
    public void constructorAppVersion_ReturnsCorrectInstance_DifferentAppNames() {
        AppVersion appVersion1 = new AppVersion("my-app", "1.0");
        AppVersion appVersion2 = new AppVersion("different-app", "1.0");
        assertNotNull(appVersion1);
        assertNotNull(appVersion2);
    }

}