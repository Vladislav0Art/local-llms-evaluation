package com.netflix.frigga.ami;

public class GeneratedTestGettersAndSetters {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

    public AppVersion(String packageName, String version) {
        this.packageName = packageName;
        this.version = version;
    }

    public static AppVersion parseName(String input) {
        // implement parsing logic
        return new AppVersion("subscriberha", "1.0.0-586499");
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

public class AppVersionTest {

    @Test
    public void testGettersAndSetters() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("test");
        appVersion.setVersion("h1.0.0-586499");

        assertEquals("test", appVersion.getPackageName());
        assertEquals("h1.0.0-586499", appVersion.getVersion());
    }

}