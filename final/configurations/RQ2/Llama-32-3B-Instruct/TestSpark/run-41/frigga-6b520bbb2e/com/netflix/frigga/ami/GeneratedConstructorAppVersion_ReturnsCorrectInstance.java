package com.netflix.frigga.ami;

public class GeneratedConstructorAppVersion_ReturnsCorrectInstance {

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
    public void constructorAppVersion_ReturnsCorrectInstance() {
        AppVersion appVersion = new AppVersion("my-app", "1.0");
        assertNotNull(appVersion);
    }

}