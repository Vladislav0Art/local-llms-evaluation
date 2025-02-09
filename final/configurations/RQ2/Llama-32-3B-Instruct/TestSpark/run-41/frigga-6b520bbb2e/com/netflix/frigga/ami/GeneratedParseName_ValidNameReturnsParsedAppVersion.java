package com.netflix.frigga.ami;

public class GeneratedParseName_ValidNameReturnsParsedAppVersion {

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
    public void parseName_ValidNameReturnsParsedAppVersion() {
        AppVersion appVersion = AppVersion.parseName("my-app/1.0");
        assertNotNull(appVersion);
        assertEquals("my-app", ((AppVersion) appVersion).getPackageName());
        assertEquals("1.0", ((AppVersion) appVersion).getVersion());
    }

}