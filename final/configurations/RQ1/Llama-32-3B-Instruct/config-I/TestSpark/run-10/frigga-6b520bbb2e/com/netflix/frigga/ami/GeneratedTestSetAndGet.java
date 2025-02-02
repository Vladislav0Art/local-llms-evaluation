package com.netflix.frigga.ami;

public class GeneratedTestSetAndGet {

    private String packageName;
    private String version;
    private String buildJobName;
    private String buildNumber;
    private String commit;

    public void setValues(String packageName, String version) {
        this.packageName = packageName;
        this.version = version;
    }

    public String getValues() {
        return packageName + ":" + version;
    }
}

public class AppVersionTest {

    @Test
    public void testSetAndGet() {
        AppVersion appVersion = new AppVersion();
        appVersion.setValues("test", "h1.0.0-586499");
        assertEquals("test", appVersion.getValues().split(":")[0]);
        assertEquals("h1.0.0-586499", appVersion.getValues().split(":")[1]);
    }

}