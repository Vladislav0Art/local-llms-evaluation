package com.netflix.frigga.ami;

public class GeneratedTestGetValues {

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
    public void testGetValues() {
        AppVersion appVersion = new AppVersion();
        appVersion.setValues("subscriberha", "1.0.0-586499");
        assertEquals("subscriberha:1.0.0-586499", appVersion.getValues());
    }

}