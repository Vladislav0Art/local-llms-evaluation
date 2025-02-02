package com.netflix.frigga.ami;

public class GeneratedTestParseName {

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
    public void testParseName() {
        AppVersion appVersion = AppVersion.parseName("subscriberha:1.0.0-586499");
        assertEquals("subscriberha", appVersion.getPackageName());
        assertEquals("1.0.0-586499", appVersion.getVersion());
    }

}